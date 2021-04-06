package src;

import src.Coffee.ICoffee;
import src.Condiment.ICondiment;

public class CustomCoffeeOrder extends CoffeeOrder{
	private ICondiment condiment;
	public CustomCoffeeOrder(ICoffee baseCoffee, ICondiment condiment) {
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
}
