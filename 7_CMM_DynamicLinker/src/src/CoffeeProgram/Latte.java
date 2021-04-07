//Latte.java
package src.CoffeeProgram;

import src.CMM.CMM_OpenAPI;
import src.Condiment.Cream;
import src.Condiment.Vanilla;

/*
 *	A preset on the Coffee making machine
 * 	It automatically adds Condiments to turn a base coffee into a Latte
 * 	While also allowing for additional extra condiments to be added
 */
public class Latte extends Coffee
{
	/**
	 * Constructor
	 * @param coffeeMaker is the platform
	 */
	public Latte(CMM_OpenAPI coffeeMaker) {
		super(coffeeMaker);
		super.setCoffee("latte", 3.0f, 3);
	}


	/**
	 * Program for Latte
	 */
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
