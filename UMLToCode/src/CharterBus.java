public class CharterBus extends Bus {
	
	/**
	 * number of passenger seats
	 */
	private int seat_count;

	/**
	 * constructor
	 * @param maker vehicle maker
	 * @param model vehicle model
	 * @param year	vehicle model year
	 * @param VIN	vehicle identification number
	 * @param PlateNO	registered license plate number
	 * @param seat_count	number of passenger seats
	 */
	public CharterBus(String maker, String model, int year, String VIN, String PlateNO, int seat_count) {
		super(maker, model, year, VIN, PlateNO);
		this.seat_count = seat_count;
		
	}

	/**
	 * @return the seat_count
	 */
	public int getSeat_count() {
		return seat_count;
	}
}
