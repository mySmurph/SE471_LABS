package src.CoffeeProgram;

import src.CMM.CMM_OpenAPI;
import src.Condiment.Cream;
import src.Condiment.Vanilla;

public class Latte extends Coffee{
	public Latte(CMM_OpenAPI coffeeMaker) {
		super(coffeeMaker);
		super.setCoffee("latte", 3.0f, 3);
	}

	@Override
	public void start() {
		coffeeMaker.setTypeLED(menuItem);
		coffeeMaker.setPowerLED(0);
		coffeeMaker.setGrindTime(9);
		coffeeMaker.setTemperature(205);
		coffeeMaker.holdTemperature(2);
		coffeeMaker.addCondiment(new Cream());
		coffeeMaker.addCondiment(new Cream());
		coffeeMaker.addCondiment(new Cream());
		coffeeMaker.addCondiment(new Cream());
		coffeeMaker.addCondiment(new Vanilla());
		addExtras();
		coffeeMaker.wait(15);
		coffeeMaker.setPowerLED(1);
		coffeeMaker.done();
	}
}
