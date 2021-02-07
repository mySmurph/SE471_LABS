package Vehicle;

public class Airplane extends Vehicle{

	private String type;
	
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
