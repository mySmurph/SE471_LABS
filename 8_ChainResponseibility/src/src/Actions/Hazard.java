//Hazard.java
package src.Actions;

public class Hazard {

	/**
	 * type of hazard
	 */
	private String type;

	/**
	 * short description
	 */
	private String desp;

	/**
	 * the seriousness of the hazard
	 */
	private int hazard_level;

	/**
	 * constructor
	 * @param type
	 * @param desp
	 * @param hazard_level
	 */
	public Hazard(String type, String desp, int hazard_level) {
		this.type = type;
		this.desp = desp;
		this.hazard_level = hazard_level;
	}

	/**
	 * get a string that describes this hazard
	 * @return complete hazard type and description
	 */
	public String toString(){
		return String.format( "%s Hazard - %s" , type, desp);
	}

	/**
	 * get the description of the hazard
	 * @return hazard description
	 */
	public String getDesp() {
		return desp;
	}

	/**
	 * get the seriousness of the hazard
	 * @return hazard level
	 */
	public int getHazard_level() {
		return hazard_level;
	}
}
