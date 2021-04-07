package src.Condiment;

public abstract class Condiment {
	private String name;
	private float price;
	public Condiment(String name, float price){
		this.name =name;
		this.price = price;
	}
	public float getPrice(){return price;}
}
