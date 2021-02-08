public class FlightRoute extends Route {

	/**
	 * flight number assigned to flight route
	 */
	private int flight_num;
	
	/**
	 * number of layovers
	 * 0 if direct flight
	 */
	private int num_of_layovers;
	
	/**
	 * constructor
	 * @param start the Address of the route's start_point
	 * @param end	the Address of the route's end_point
	 * @param flight_num	flight number assigned to flight route
	 * @param num_of_layovers	number of layovers
	 */
	public FlightRoute(Address start, Address end, int flight_num, int num_of_layovers) {
		super(start, end);
		this.setFlight_number(flight_num);
		this.setNum_of_layovers(num_of_layovers);
	}
	
	/**
	 * constructor
	 * @param start the Address of the route's start_point
	 * @param end	the Address of the route's end_point
	 * @param flight_num	flight number assigned to route
	 */
	public FlightRoute(Address start, Address end, int flight_num) {
		this(start, end, flight_num, 0);
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
