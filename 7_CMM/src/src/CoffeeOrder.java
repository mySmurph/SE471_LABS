package src;

import src.Coffee.ICoffee;

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
	@Override
	public void setGrindingTime(int secs){
		baseCoffee.setGrindingTime(secs);
	}
	public void setTempHoldTime(int secs){
		baseCoffee.setTempHoldTime(secs);
	}
	public void setBrewTime(int secs){
		baseCoffee.setBrewTime(secs);
	}

}
