package src.CoffeeProgram;

import src.CMM.CMM_OpenAPI;
import src.Condiment.Condiment;
import java.util.*;

public abstract class Coffee {
	protected String type;
	protected float menuPrice;
	protected int menuItem;
	protected ArrayList<Condiment> extraCondiments;
	protected CMM_OpenAPI coffeeMaker;

	public Coffee(CMM_OpenAPI coffeeMaker) {
		this.coffeeMaker = coffeeMaker;
		this.extraCondiments = new ArrayList<Condiment>();
	}

	public void setCoffee(String type, float menuPrice, int menuItem) {
		this.type = type;
		this.menuPrice = menuPrice;
		this.menuItem = menuItem;
	}
	public abstract void start();

	public float getMenuPrice() {
		float total = menuPrice;
		for (Condiment extra:extraCondiments) {
			total += extra.getMenuPrice();
		}
		return total;
	}
	public void customizeOrder(Condiment addExtraCondiment){
		extraCondiments.add(addExtraCondiment);
	}
	protected void addExtras(){
		for (Condiment extra:extraCondiments) {
			coffeeMaker.addCondiment(extra);
		}
	}
	public String toString(){
		StringBuilder coffee = new StringBuilder(type);
		for (Condiment extra:extraCondiments) {
			coffee.append(" +" + extra.toString());
		}
		return coffee.toString();
	}
}
