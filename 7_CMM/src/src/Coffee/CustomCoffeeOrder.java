package src.Coffee;

import src.Coffee.ICoffee;
import src.CoffeeOrder;
import src.Condiment.Condiment;

public class CustomCoffeeOrder implements ICoffee {
	private ICoffee baseCoffee;
	private Condiment condiment;
	public CustomCoffeeOrder(ICoffee baseCoffee, Condiment condiment) {
		super(baseCoffee);
		this.condiment = condiment;
	}

	@Override
	public float getPrice() {
		return condiment.getPrice() + super.getPrice();
	}

	@Override
	public void start() {
		super.start();
	}

	@Override
	public void setGrindingTime(int secs) {

	}

	@Override
	public void setTemperature(int degree) {

	}

	@Override
	public void setTempHoldTime(int secs) {

	}

	@Override
	public void setBrewTime(int secs) {

	}
}
