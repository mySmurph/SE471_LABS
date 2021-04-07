package src.CoffeeProgram;

import src.CMM.CMM_OpenAPI;
import src.Condiment.Cream;
import src.Condiment.Vanilla;

public class Mocha extends Coffee{
	public Mocha(CMM_OpenAPI coffeeMaker) {
		super(coffeeMaker);
		super.setCoffee("Mocha", 2.0f, 2);
	}

	@Override
	public void start() {
		coffeeMaker.setTypeLED(menuItem);
		coffeeMaker.setPowerLED(0);
		coffeeMaker.setGrindTime(5);
		coffeeMaker.setTemperature(200);
		coffeeMaker.holdTemperature(5);
		coffeeMaker.addCondiment(new Cream());
		coffeeMaker.addCondiment(new Vanilla());
		addExtras();
		coffeeMaker.wait(15);
		coffeeMaker.setPowerLED(1);
		coffeeMaker.done();
	}
}
