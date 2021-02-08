import java.util.ArrayList;

public class Trip {
	
	/**
	 * general origin of trip
	 */
	private String origin;
	
	/**
	 * general destination of trip
	 */
	private String destination;
	
	/**
	 * list of schedules the trip will take
	 */
	private ArrayList<Schedule> scheduled_for;
	
	/**
	 * constructor
	 * @param origin	the trip's origin
	 * @param destination	 the trip's destination
	 */
	public Trip(String origin, String destination) {
		this.setOrigin(origin);
		this.setDestination(destination);
		this.scheduled_for = new ArrayList<Schedule>();
	}
	
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	/**
	 * @param scheduled_event the Schedule to be added to scheduled_for
	 */
	public void pushSchedule(Schedule scheduled_event) {
		this.scheduled_for.add(scheduled_event);
	}
}
