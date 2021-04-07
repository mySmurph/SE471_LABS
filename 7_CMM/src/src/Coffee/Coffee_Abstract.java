package src.Coffee;

public class Coffee_Abstract implements ICoffee{
	private String type;
	private int itemNum;
	private float price;
	protected boolean notRunning;
	private int grindTime;
	private int temper;
	private int temperHoldTime;
	private int brewTime;

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

	private boolean settingsSet(){
		return (isSet(grindTime) && isSet(temper) && isSet(temperHoldTime)  && isSet(brewTime) );
	}
	private boolean isSet(int setting){
		return setting > 0;
	}
	@Override
	public void start() {
		System.out.printf("Start: %s \n", type);
		if(settingsSet()){
			displayLED();
			grindBeans();
			heatWater();
			holdTemperature();
			brewCoffee();
			displayLED();
		}else{
			System.out.println("Settings not set");
		}
	}

	protected void displayLED(){
		System.out.printf("LED: [%d|%d]\n", notRunning, itemNum);
	}
	private void grindBeans(){
		while(grindTime-- > 0){
			System.out.println("\tGrinding Time Remaining: " + grindTime);
			wait(1);
		}
	}
	private void heatWater(){
		int tapTemp = (int) (Math.random() * (72-45) + 45);
		while (tapTemp != temper){
			System.out.printf("\tHeating Water: %d\n", tapTemp);
			tapTemp += tapTemp > temper - 2 ? temper - tapTemp: (int)(Math.random()*(5-2)+3);     // heat water in random incriments
			wait(1);
		}

	}
	private void brewCoffee(){
		while(brewTime-- > 0){
			System.out.printf("\tBrewing Time Remaining: %d\n", brewTime);
		}
	}
	@Override
	public void setGrindingTime(int secs) {
		if(!isSet(grindTime))
			this.grindTime = secs;
	}

	@Override
	public void setTemperature(int degree) {
		if(!isSet(temper))
			this.temper = degree;
	}

	@Override
	public void setTempHoldTime(int secs) {
		if(!isSet(temperHoldTime))
			this.temperHoldTime = secs;
	}

	@Override
	public void setBrewTime(int secs) {
		if(!isSet(brewTime))
			this.brewTime = secs;
	}

	private void holdTemperature() {
		System.out.printf("\tHolding %d degrees for %d sec.\n", temper, temperHoldTime);
		wait(temperHoldTime);
	}

	protected void wait(int seconds) {
		try {
			Thread.sleep((long)(seconds*10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
