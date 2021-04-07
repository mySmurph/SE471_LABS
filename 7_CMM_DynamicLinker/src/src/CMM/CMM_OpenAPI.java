//   CMM_OpenAPI.java
package src.CMM;

import src.CoffeeProgram.Coffee;
import src.Condiment.Condiment;

public interface CMM_OpenAPI {
	public void setCoffeeType(String coffeeOrder);
	public void setGrindTime(int secs);
	public void addCondiment(Condiment condiment);
	public void setTemperature(int temperature);
	public void holdTemperature(int secs);
	public void setPowerLED(int num);
	public void setTypeLED(int num);

	public double computePrice(Coffee coffeeOrder);
	public void wait(int secs);
	public void done();
}
