

public class ExpressBus extends Bus {
	
	/**
	 * safe passenger occupancy limit
	 */
	private int passenger_limit;
	
	/**
	 * Mechanism exist that facilitates passenger to request a stop 
	 */
	private boolean stop_request_bell;
	
	/**
	 * constructor
	 * @param maker vehicle maker
	 * @param model vehicle model
	 * @param year	vehicle model year
	 * @param VIN	vehicle identification number
	 * @param PlateNO	registered license plate number
	 * @param passenger_limit	safe passenger occupancy limit
	 * @param stop_request_bell	Mechanism exist that facilitates passenger to request a stop 
	 */
	public ExpressBus(String maker, String model, int year, String VIN, String PlateNO, int passenger_limit, boolean stop_request_bell) {
		super(maker, model, year, VIN, PlateNO);
		this.setPassenger_limit(passenger_limit);
		this.setStop_request_bell(stop_request_bell);
	}

	/**
	 * @return the passenger_limit
	 */
	public int getPassenger_limit() {
		return passenger_limit;
	}

	/**
	 * @param passenger_limit the passenger_limit to set
	 */
	public void setPassenger_limit(int passenger_limit) {
		this.passenger_limit = passenger_limit;
	}

	/**
	 * @return the stop_request_bell
	 */
	public boolean isStop_request_bell() {
		return stop_request_bell;
	}

	/**
	 * @param stop_request_bell the stop_request_bell to set
	 */
	public void setStop_request_bell(boolean stop_request_bell) {
		this.stop_request_bell = stop_request_bell;
	}

}
