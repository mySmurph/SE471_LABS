package src.Coffee;

public interface ICoffee{
	public float getPrice();
	public void start();
	public void setGrindingTime(int secs);
	public void setTemperature(int degree);
	public void setTempHoldTime(int secs);
	public void setBrewTime(int secs);


//	public void wait(int seconds);

//	public void setPowerLED (int num);
//	public void setTypeLED (int num);
//	public void addCondiment(ICondiment type);
//	public void done();
//	public void setCoffeeType(String str);
//	public void holdTemperature(int seconds);
}
