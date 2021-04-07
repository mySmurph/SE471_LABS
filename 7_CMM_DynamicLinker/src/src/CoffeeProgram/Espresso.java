package src.CoffeeProgram;

import src.CMM.CMM_OpenAPI;
import src.Condiment.Cream;
import src.Condiment.Vanilla;

public class Espresso extends Coffee{
	public Espresso(CMM_OpenAPI coffeeMaker) {
		super(coffeeMaker);
		super.setCoffee("Espresso", 4.0f, 4);
	}

	@Override
	public void start() {
		coffeeMaker.setTypeLED(menuItem);
		coffeeMaker.setPowerLED(0);
		coffeeMaker.setGrindTime(10);
		coffeeMaker.setTemperature(198);
		coffeeMaker.holdTemperature(4);
		coffeeMaker.addCondiment(new Cream());
		coffeeMaker.addCondiment(new Vanilla());
		addExtra();
		coffeeMaker.wait(15);
		coffeeMaker.setPowerLED(1);
		coffeeMaker.done();
	}
}
