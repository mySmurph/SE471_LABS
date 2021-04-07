package src.Condiment;

public abstract class Condiment {
	private float menuPrice;

	public Condiment(float menuPrice) {
		this.menuPrice = menuPrice;
	}

	public float getMenuPrice() {
		return menuPrice;
	}
	abstract public String toString();
}
