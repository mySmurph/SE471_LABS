package src.Coffee;

public class Coffee_Mocha extends Coffee_Abstract{
	public Coffee_Mocha() {
		super("Mocha", 2.0f, 2);
	}
	@Override
	public void start() {
		super.setGrindingTime(5);
		super.setBrewTime(15);
		super.setTemperature(200);
		super.setTempHoldTime(2);
		super.start();
	}
}
