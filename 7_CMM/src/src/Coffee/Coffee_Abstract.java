package src.Coffee;

public class Coffee_Abstract implements ICoffee{
	private String type;
	private int itemNum;
	private float price;
	private boolean notRunning;

	public Coffee_Abstract(String type, float price, int itemNum) {
		this.type = type;
		this.price = price;
		this.itemNum = itemNum;
		this.notRunning = true;
	}

	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public void start() {
		System.out.printf("LED: [%d|%d]\n", notRunning, itemNum);

	}
}
