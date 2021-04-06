package src.Condiment;

public abstract class Condement_Abstract implements ICondiment{
	private String name;
	private float price;
	public Condement_Abstract(String name, float price){
		this.name =name;
		this.price = price;
	}
	public float getPrice(){return price;}
}
