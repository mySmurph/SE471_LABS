import java.util.ArrayList;

public class Vehicle {

	/**
	 * vehicle maker
	 */
	private String maker;
	
	/**
	 * vehicle model
	 */
	private String model;
	
	/**
	 * vehicle manufactured year
	 */
	private int year;
	
	/**
	 * list of schedules that vehicle is scheduled for 
	 */
	private  ArrayList<Schedule> scheduled_via;
	
	/**
	 * constructor
	 * @param maker vehicle maker
	 * @param model vehicle model
	 * @param year	vehicle manufactured year
	 */
	public Vehicle(String maker, String model, int year) {
		this.maker = maker;
		this.model = model;
		this.year = year;
		this.scheduled_via = new ArrayList<Schedule>();
	}

	/**
	 * @return the maker
	 */
	public String getMaker() {
		return maker;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * @param scheduled_event the Schedule to be added to scheduled_via
	 */
	public void pushSchedule(Schedule scheduled_event) {
		this.scheduled_via.add(scheduled_event);
	}
	

}
