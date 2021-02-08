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
		this.PlateNO = PlateNO;
		this.VIN = VIN;
	}

	/**
	 * @return the VIN
	 */
	public String getVIN() {
		return VIN;
	}

	/**
	 * @return the plateNO
	 */
	public String getPlateNO() {
		return PlateNO;
	}
}
