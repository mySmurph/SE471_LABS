package src;

import src.Coffee.ICoffee;
import src.Condiment.ICondiment;

public abstract class CoffeeOrder implements ICoffee {
	private ICoffee baseCoffee;

	public CoffeeOrder(ICoffee baseCoffee) {
		this.baseCoffee = baseCoffee;
	}
	public float getPrice(){
		return baseCoffee.getPrice();
	}
	public void start(){
		baseCoffee.start();
	}
	@Override
	public void setTemperature(int degree) {
		baseCoffee.setTemperature(degree);
	}
	public void setGrindingTime(int secs){
		baseCoffee.setGrindingTime(secs);
	}

}
