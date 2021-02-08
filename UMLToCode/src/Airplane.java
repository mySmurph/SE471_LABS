public class Airplane extends Vehicle{

	/**
	 * type of airplane
	 */
	private String type;
	
	/**
	 * constructor
	 * @param maker vehicle maker
	 * @param model vehicle model
	 * @param year	vehicle model year
	 * @param type	type of airplane
	 */
	public Airplane(String maker, String model, int year, String type) {
		super(maker, model, year);
		this.setType(type);
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


}
