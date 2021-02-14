import java.util.ArrayList;

public class Route {
	
	/**
	 * the Address of the route's start_point
	 */
	private Address start_point;
	
	/**
	 * the Address of the route's end_point
	 */
	private Address end_point;
	
	/**
	 * the list of schedules that take this route
	 */
	private ArrayList<Schedule> scheduled_on;

	/**
	 * constructor
	 * @param start the Address of the route's start_point
	 * @param end	the Address of the route's end_point
	 */
	public Route(Address start, Address end) {
		this.start_point = start;
		this.end_point = end;
		this.scheduled_on = new ArrayList<Schedule>();
	}

	/**
	 * @return the start_point
	 */
	public Address getStart_point() {
		return start_point;
	}

	/**
	 * @return the end_point
	 */
	public Address getEnd_point() {
		return end_point;
	}

	/**
	 * @param scheduled_event the Schedule to be added to scheduled_on
	 */
	public void pushSchedule(Schedule scheduled_event) {
		this.scheduled_on.add(scheduled_event);
	}
}
