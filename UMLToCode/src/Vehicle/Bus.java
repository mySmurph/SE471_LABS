package Vehicle;

public class Bus extends Vehicle{

	private String VIN;
	private String PlateNO;
	
	public Bus(String maker, String model, int year, String VIN, String PlateNO) {
		super(maker, model, year);
		this.setPlateNO(PlateNO);
		this.setVIN(VIN);
	}

	public String getVIN() {
		return VIN;
	}

	public void setVIN(String vIN) {
		VIN = vIN;
	}

	public String getPlateNO() {
		return PlateNO;
	}

	public void setPlateNO(String plateNO) {
		PlateNO = plateNO;
	}
	
}
