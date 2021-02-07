package Vehicle;

public class CharterBus extends Bus {
	
	private int seat_count;

	public CharterBus(String maker, String model, int year, String VIN, String PlateNO, int seat_count) {
		super(maker, model, year, VIN, PlateNO);
		this.setSeat_count(seat_count);
		
	}

	/**
	 * @return the seat_count
	 */
	public int getSeat_count() {
		return seat_count;
	}

	/**
	 * @param seat_count the seat_count to set
	 */
	public void setSeat_count(int seat_count) {
		this.seat_count = seat_count;
	}



}
