//   Coffee.java
package src.CoffeeProgram;

import src.CMM.CMM_OpenAPI;
import src.Condiment.Condiment;
import java.util.*;

public abstract class Coffee {

	/**
	 * name of coffee on menu
	 */
	protected String type;

	/**
	 * base menu price
	 */
	protected float menuPrice;

	/**
	 * number associated with menu selection
	 */
	protected int menuItem;

	/**
	 * customize additives
	 */
	protected ArrayList<Condiment> extraCondiments;

	/**
	 * platform
	 */
	protected CMM_OpenAPI coffeeMaker;

	/**
	 * constructor
	 * @param coffeeMaker platform
	 */
	public Coffee(CMM_OpenAPI coffeeMaker) {
		this.coffeeMaker = coffeeMaker;
		this.extraCondiments = new ArrayList<Condiment>();
	}

	/**
	 * set details of coffee object
	 * @param type name of coffee
	 * @param menuPrice base price
	 * @param menuItem  menu item number
	 */
	public void setCoffee(String type, float menuPrice, int menuItem) {
		this.type = type;
		this.menuPrice = menuPrice;
		this.menuItem = menuItem;
	}

	/**
	 * run the program for this coffee order
	 */
	public abstract void start();

	/**
	 * get the total price of coffee + customized coffee condiment
	 * @return float the final cost of the item
	 */
	public float getMenuPrice() {
		float total = menuPrice;
		for (Condiment extra:extraCondiments) {
			total += extra.getMenuPrice();
		}
		return total;
	}

	/**
	 * add a condiment to customize the coffee order
	 * @param addExtraCondiment
	 */
	public void customizeOrder(Condiment addExtraCondiment){
		extraCondiments.add(addExtraCondiment);
	}
	protected void addExtras(){
		for (Condiment extra:extraCondiments) {
			coffeeMaker.addCondiment(extra);
		}
	}

	/**
	 * get a string of the coffee object
	 * @return a string that describes this coffee
	 */
	public String toString(){
		StringBuilder coffee = new StringBuilder(type);
		for (Condiment extra:extraCondiments) {
			coffee.append(" +" + extra.toString());
		}
		return coffee.toString();
	}
}
