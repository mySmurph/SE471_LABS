package src.Coffee;

public class Coffee_Regular extends Coffee_Abstract{
	public Coffee_Regular() {
		super("Regular", 1.0f, 1);
	}

	@Override
	public void start() {
		super.setGrindingTime(8);
		super.setBrewTime(15);
		super.setTemperature(150);
		super.setTempHoldTime(2);
		super.start();
	}
}
