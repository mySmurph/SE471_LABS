package src;

import src.Coffee.ICoffee;
import src.Condiment.ICondiment;

public abstract class CoffeeOrder implements ICoffee {
	private ICoffee baseCoffee;
	private ICondiment condiment;

	public CoffeeOrder(ICoffee baseCoffee) {
		this.baseCoffee = baseCoffee;
	}
	public float getPrice(){
		return baseCoffee.getPrice();
	}
	public void start(){
		baseCoffee.start();
	}
}
