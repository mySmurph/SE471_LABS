public class Bus extends Vehicle{

	/**
	 * vehicle identification number
	 */
	private String VIN;
	
	/**
	 * registered license plate number
	 */
	private String PlateNO;

	/**
	 * constructor
	 * @param maker vehicle maker
	 * @param model vehicle model
	 * @param year	vehicle model year
	 * @param VIN	vehicle identification number
	 * @param PlateNO	registered license plate number
	 */
	public Bus(String maker, String model, int year, String VIN, String PlateNO) {
		super(maker, model, year);
		this.setPlateNO(PlateNO);
		this.setVIN(VIN);
	}

	/**
	 * @return the VIN
	 */
	public String getVIN() {
		return VIN;
	}

	/**
	 * @param VIN the VIN to set
	 */
	public void setVIN(String vIN) {
		VIN = vIN;
	}

	/**
	 * @return the plateNO
	 */
	public String getPlateNO() {
		return PlateNO;
	}

	/**
	 * @param plateNO the plateNO to set
	 */
	public void setPlateNO(String plateNO) {
		PlateNO = plateNO;
	}

	
}
