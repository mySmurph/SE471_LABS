//Mocha.java

package src.CoffeeProgram;

import src.CMM.CMM_OpenAPI;
import src.Condiment.Cream;
import src.Condiment.Vanilla;
/**
*	A preset on the Coffee making machine
* 	It automatically adds Condiments to turn a base coffee into a mocha
* 	While also allowing for additional extra condiments to be added
*/

public class Mocha extends Coffee
{
	/**
	 * Constructor
	 * @param coffeeMaker is the platform
	 */
	public Mocha(CMM_OpenAPI coffeeMaker) {
		super(coffeeMaker);
		super.setCoffee("Mocha", 2.0f, 2);
	}

	/**
	 * Program for Mocha
	 */
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
