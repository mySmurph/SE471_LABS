//Espresso.java

package src.CoffeeProgram;

import src.CMM.CMM_OpenAPI;
import src.Condiment.Cream;
import src.Condiment.Vanilla;

/*
 *	A preset on the Coffee making machine
 * 	It automatically adds Condiments to turn a base coffee into a Espresso
 * 	While also allowing for additional extra condiments to be added
 *
 */
public class Espresso extends Coffee
{
	/**
	 * Constructor
	 * @param coffeeMaker is the platform
	 */
	public Espresso(CMM_OpenAPI coffeeMaker) {
		super(coffeeMaker);
		super.setCoffee("Espresso", 4.0f, 4);
	}

	/**
	 * Program for Espresso
	 */
	@Override
	public void start() {
		coffeeMaker.setTypeLED(menuItem);
		coffeeMaker.setPowerLED(0);
		coffeeMaker.setGrindTime(10);
		coffeeMaker.setTemperature(198);
		coffeeMaker.holdTemperature(4);
		coffeeMaker.addCondiment(new Cream());
		coffeeMaker.addCondiment(new Vanilla());
		addExtras();
		coffeeMaker.wait(15);
		coffeeMaker.setPowerLED(1);
		coffeeMaker.done();
	}
}
