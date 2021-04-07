package src.CoffeeProgram;

import src.CMM.CMM_OpenAPI;

public class Regular extends Coffee{
	public Regular(CMM_OpenAPI coffeeMaker) {
		super(coffeeMaker);
		super.setCoffee("Regular", 1.0f, 1);
	}

	@Override
	public void start() {
		coffeeMaker.setTypeLED(menuItem);
		coffeeMaker.setPowerLED(0);
		coffeeMaker.setGrindTime(8);
		coffeeMaker.setTemperature(150);
		coffeeMaker.holdTemperature(2);
		addExtra();
		coffeeMaker.wait(15);
		coffeeMaker.setPowerLED(1);
		coffeeMaker.done();
	}
}
