import java.time.ZonedDateTime;

public class Schedule {
	
	/**
	 * departure time
	 */
	private ZonedDateTime start_time;
	
	/**
	 * arrival time
	 */
	private ZonedDateTime end_time;
	
	/**
	 * rout taken
	 */
	private Route on_route;
	
	/**
	 * trip this schedule is for
	 */
	private Trip for_trip;
	
	/**
	 * vehicle used
	 */
	private Vehicle via_vehicle;

	/**
	 * constructor
	 * @param start_time	departure time
	 * @param end_time	arrival time
	 * @param on_route	rout taken
	 * @param for_trip	trip this schedule is for
	 * @param via_vehicle	vehicle used
	 */
	public Schedule(ZonedDateTime start_time, ZonedDateTime end_time, Route on_route, Trip for_trip, Vehicle via_vehicle) {
		this.setStart_time(start_time);
		this.setEnd_time(end_time);
		this.setOn_route(on_route);
		this.setFor_trip(for_trip);
		this.setVia_vehicle(via_vehicle);
	}

	/**
	 * @return the start_time
	 */
	public ZonedDateTime getStart_time() {
		return start_time;
	}

	/**
	 * @param start_time the start_time to set
	 */
	public void setStart_time(ZonedDateTime start_time) {
		this.start_time = start_time;
	}

	/**
	 * @return the end_time
	 */
	public ZonedDateTime getEnd_time() {
		return end_time;
	}

	/**
	 * @param end_time the end_time to set
	 */
	public void setEnd_time(ZonedDateTime end_time) {
		this.end_time = end_time;
	}

	/**
	 * @return the on_route
	 */
	public Route getOn_route() {
		return on_route;
	}

	/**
	 * @param on_route the on_route to set
	 */
	public void setOn_route(Route on_route) {
		this.on_route = on_route;
	}

	/**
	 * @return the for_trip
	 */
	public Trip getFor_trip() {
		return for_trip;
	}

	/**
	 * @param for_trip the for_trip to set
	 */
	public void setFor_trip(Trip for_trip) {
		this.for_trip = for_trip;
	}

	/**
	 * @return the via_vehicle
	 */
	public Vehicle getVia_vehicle() {
		return via_vehicle;
	}

	/**
	 * @param via_vehicle the via_vehicle to set
	 */
	public void setVia_vehicle(Vehicle via_vehicle) {
		this.via_vehicle = via_vehicle;
	}

}
