// Cappuccino.java

package src.CoffeeProgram;

import src.CMM.CMM_OpenAPI;
import src.Condiment.Cream;

/*
*	A preset on the Coffee making machine
* 	It automatically adds Condiments to turn a base coffee into a Cappuccino
 * 	While also allowing for additional extra condiments to be added
*/
public class Cappuccino extends Coffee{

	/**
	 * constructor
	 * @param coffeeMaker is platform
	 */
	public Cappuccino(CMM_OpenAPI coffeeMaker) {
		super(coffeeMaker);
		super.setCoffee("Cappuccino", 5.0f, 5);
	}

	/**
	 * program for cappuccino
	 */
	@Override
	public void start() {
		coffeeMaker.setTypeLED(menuItem);
		coffeeMaker.setPowerLED(0);
		coffeeMaker.setGrindTime(10);
		coffeeMaker.setTemperature(198);
		coffeeMaker.holdTemperature(4);
		coffeeMaker.addCondiment(new Cream());
		addExtras();
		coffeeMaker.wait(15);
		coffeeMaker.setPowerLED(1);
		coffeeMaker.done();
	}
}
