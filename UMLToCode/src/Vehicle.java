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
		this.setMaker(maker);
		this.setModel(model);
		this.setYear(year);
		this.scheduled_via = new ArrayList<Schedule>();
	}

	/**
	 * @return the maker
	 */
	public String getMaker() {
		return maker;
	}

	/**
	 * @param maker the maker to set
	 */
	public void setMaker(String maker) {
		this.maker = maker;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * @param scheduled_event the Schedule to be added to scheduled_via
	 */
	public void pushSchedule(Schedule scheduled_event) {
		this.scheduled_via.add(scheduled_event);
	}
	

}
