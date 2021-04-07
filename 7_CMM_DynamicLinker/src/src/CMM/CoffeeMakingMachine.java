package src.CMM;

import src.CoffeeProgram.*;
import src.Condiment.Chocolate;
import src.Condiment.Condiment;
import src.Condiment.Cream;
import src.Condiment.Vanilla;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CoffeeMakingMachine implements CMM_OpenAPI{

	private List<Coffee> coffeeOrders = new ArrayList<Coffee>();
	private int power;
	private int type;

	private Coffee currentOrder;

	public CoffeeMakingMachine() {
		power = 1;
		type = 0;
		displayLED();
	}

	@Override
	public void setCoffeeType(String coffeeOrder) {
		StringTokenizer order = new StringTokenizer(coffeeOrder);

		switch (order.nextToken().toUpperCase()){
			case "REGULAR":    currentOrder = new Regular(this);
				break;
			case "MOCHA":      currentOrder = new Mocha(this);
				break;
			case "LATTE":      currentOrder = new Latte(this);
				break;
			case "ESPRESSO":   currentOrder = new Espresso(this);
				break;
			case "CAPACCHINO": currentOrder = new Cappuccino(this);
				break;
		}
		int count = 1;
		while(order.hasMoreTokens()){
			Condiment extra = null;
			String parse = order.nextToken().toUpperCase();
			switch (parse){
				case "CREAM":    extra = new Cream();
					break;
				case "VANILLA":    extra = new Vanilla();
					break;
				case "CHOCOLATE":    extra = new Chocolate();
					break;
			}
			if(extra != null) {
				while (count-- > 0) currentOrder.customizeOrder(extra);
				count = 1;
			}else{
				try{
					count = Integer.valueOf(parse);
				} catch (NumberFormatException e) { /* do nothing we just want to skip it*/}
			}
		}
		currentOrder.start();
	}

	@Override
	public void setGrindTime(int secs) {
		System.out.printf("\t\tGrinding Beans for %d seconds\n", secs);
		wait(secs);
	}

	@Override
	public void addCondiment(Condiment contiment) {
		System.out.printf("\t\t%s added.\n", contiment.toString());
	}

	@Override
	public void setTemperature(int temperature) {
		System.out.printf("\t\tHeating water to %d degrees.\n", temperature);
	}

	@Override
	public void holdTemperature(int secs) {
		System.out.printf("\t\tHolding Temperature for %d seconds\n", secs);
		wait(secs);
	}

	@Override
	public void setPowerLED(int num) {
		this.power = num;
		if(power == 1)//off
			setTypeLED(0);
		displayLED();
	}

	@Override
	public void setTypeLED(int num) {
		this.type = num;
		displayLED();
	}

	@Override
	public double computePrice(Coffee coffeeOrder) {
		return coffeeOrder.getMenuPrice();
	}

	@Override
	public void wait(int secs) {
		try {
			Thread.sleep(secs * 100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void done() {
		System.out.printf("%s\t\t$%.2f\n",currentOrder.toString(),  computePrice(currentOrder));
		coffeeOrders.add(currentOrder);
		currentOrder = null;
	}
	private void displayLED(){
		System.out.printf("[ %d | %d ]\n", power, type);
	}
}
