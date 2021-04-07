package src.CMM;

public interface CMM_OpenAPI {
	public void setCoffeeType(String type);
	public void setGrindTime(int secs);
	public void addCondiment(/**/);
	public void setTemperature(int temperature);
	public void holdTemperature(int secs);
	public void setPowerLED(int num);
	public void setTypeLED(int num);

	public double computePrice(/**/);
	public void wait(int secs);
	public void done();
}
