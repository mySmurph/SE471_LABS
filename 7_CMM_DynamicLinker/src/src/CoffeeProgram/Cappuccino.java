package src.CoffeeProgram;

import src.CMM.CMM_OpenAPI;
import src.Condiment.Cream;
import src.Condiment.Vanilla;

public class Cappuccino extends Coffee{
	public Cappuccino(CMM_OpenAPI coffeeMaker) {
		super(coffeeMaker);
		super.setCoffee("Cappuccino", 5.0f, 5);
	}

	@Override
	public void start() {
		coffeeMaker.setTypeLED(menuItem);
		coffeeMaker.setPowerLED(0);
		coffeeMaker.setGrindTime(10);
		coffeeMaker.setTemperature(198);
		coffeeMaker.holdTemperature(4);
		coffeeMaker.addCondiment(new Cream());
		addExtra();
		coffeeMaker.wait(15);
		coffeeMaker.setPowerLED(1);
		coffeeMaker.done();
	}
}
