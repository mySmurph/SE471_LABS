package src.Actions;

public class Hazard {
	private String type;
	private String desp;
	private int hazard_level;

	public Hazard(String type, String desp, int hazard_level) {
		this.type = type;
		this.desp = desp;
		this.hazard_level = hazard_level;
	}

	public String toString(){
		return type;
	}

	public String getDesp() {
		return desp;
	}

	public int getHazard_level() {
		return hazard_level;
	}
}
