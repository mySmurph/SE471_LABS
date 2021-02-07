package Route;

public class FlightRoute extends Route {

	private int flight_num;
	private int num_of_layovers;
	public FlightRoute(Address start, Address end, int flight_num, int num_of_layovers) {
		super(start, end);
		setFlight_number(flight_num);
		setNum_of_layovers(num_of_layovers);
	}
	/**
	 * @return the flight_number
	 */
	public int getFlight_number() {
		return flight_num;
	}
	/**
	 * @param flight_number the flight_number to set
	 */
	public void setFlight_number(int flight_num) {
		this.flight_num = flight_num;
	}
	/**
	 * @return the num_of_layovers
	 */
	public int getNum_of_layovers() {
		return num_of_layovers;
	}
	/**
	 * @param num_of_layovers the num_of_layovers to set
	 */
	public void setNum_of_layovers(int num_of_layovers) {
		this.num_of_layovers = num_of_layovers;
	}

}
