//   CoffeeMakingMachine.java

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

	/**
	 * sale records
	 */
	private List<Coffee> coffeeOrders = new ArrayList<Coffee>();

	/**
	 * the power stat of the machine
	 */
	private int power;

	/**
	 * the current order being processed
	 */
	private int type;

	/**
	 * the current program being executed
	 */
	private Coffee currentOrder;

	/**
	* Constructor for the Coffee Making Machine
	*/
	public CoffeeMakingMachine() {
		power = 1;
		type = 0;
		displayLED();
	}

	/**
	 * This is the listener for the User inputs on what coffee they want
	 * And which adds on they want
	 * @param coffeeOrder string that describes the coffee
	 */
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
			case "CAPPUCCINO": currentOrder = new Cappuccino(this);
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

	/**
	 * Displays how long the beans were
	 * Ground for
	 * @param secs the amount of time to grind beans
	 */
	@Override
	public void setGrindTime(int secs) {
		System.out.printf("\t\tGrinding Beans for %d seconds\n", secs);
		wait(secs);
	}

	/**
	 * Prints the individually added condiments
	 * i.e. Vanilla
	 * @param condiment the condiment being added
	 */
	@Override
	public void addCondiment(Condiment condiment) {
		System.out.printf("\t\t%s added.\n", condiment.toString());
	}

	/**
	 * Displays and Sets the Brewing Temperature for the coffee
	 * @param temperature the temp to be reach
	 */
	@Override
	public void setTemperature(int temperature) {
		System.out.printf("\t\tHeating water to %d degrees.\n", temperature);
	}

	/**
	 * Displays and sets how long the Brewing Temperature must last
	 * That doesn't sound right, whats a better way to describe this, It is b
	 * @param secs the length of time the temp is to be held
	 */
	@Override
	public void holdTemperature(int secs) {
		System.out.printf("\t\tHolding Temperature for %d seconds\n", secs);
		wait(secs);
	}

	/**
	 * For power,
	 * 1, Open to receiving orders
	 * 0, Is busy with an order
	 * @param num the current running state of the machine
	 */
	@Override
	public void setPowerLED(int num) {
		this.power = num;
		if(power == 1)//off
			setTypeLED(0);
		displayLED();
	}

	/**
	 * For the LED Light that is not power, it displays which type of order is displayed
	 * 0 serves as No order selected
	 * 1 for regular coffee
	 * 2 for Mocha
	 * 3 for Latte
 	 * 4 for Espresso
	 * 5 for Cappuccino
	 * @param num the selected order
	 */
	@Override
	public void setTypeLED(int num) {
		this.type = num;
		displayLED();
	}

	/**
	 * Returns the Price of the Order
	 * @param coffeeOrder the order to be calculated
	 * @return double the total cost
	 */
	@Override
	public double computePrice(Coffee coffeeOrder) {
		return coffeeOrder.getMenuPrice();
	}

	/**
	 * Displays how long the step must wait before it can move on to the next step
	 * @param secs the amount of time in seconds for the machine to pause activity
	 */
	@Override
	public void wait(int secs) {
		try {
			System.out.printf("\t\tWaiting for %d seconds\n", secs);
			Thread.sleep(secs * 100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * transaction of a cup and adds the sold coffee object to the List
	 */
	@Override
	public void done() {
		System.out.printf("%s\t\t$%.2f\n",currentOrder.toString(),  computePrice(currentOrder));
		coffeeOrders.add(currentOrder);
		currentOrder = null;
	}

	/**
	 * display current state of the machine
	 */
	private void displayLED(){
		System.out.printf("[ %d | %d ]\n", power, type);
	}
}
