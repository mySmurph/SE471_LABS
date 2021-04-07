// Condiment.java

package src.Condiment;

public abstract class Condiment {

	/**
	 * price of item
	 */
	private float menuPrice;

	/**
	 * constructor
	 * @param menuPrice price of item
	 */
	public Condiment(float menuPrice) {
		this.menuPrice = menuPrice;
	}

	/**
	 * get price of item
	 * @return float item price
	 */
	public float getMenuPrice() {
		return menuPrice;
	}

	/**
	 * get description of item
	 * @return item description
	 */
	abstract public String toString();
}
