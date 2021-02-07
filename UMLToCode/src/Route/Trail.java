package Route;

public class Trail extends Route {

	public enum Terrain {
		FOOT_TRAIL,
		BIKEWAY,
		BOARDWALK,
		NATURE, 
		MULTI_USE
		
	}

	private String park_name;
	private Terrain primary_terrain;
	
	public Trail(Address start, Address end, String park_name, Terrain primary_terrain) {
		super(start, end);
		this.setPark_name(park_name);
		this.setPrimary_terrain(primary_terrain);
	}

	/**
	 * @return the park_name
	 */
	public String getPark_name() {
		return park_name;
	}

	/**
	 * @param park_name the park_name to set
	 */
	public void setPark_name(String park_name) {
		this.park_name = park_name;
	}

	/**
	 * @return the primary_terrain
	 */
	public Terrain getPrimary_terrain() {
		return primary_terrain;
	}

	/**
	 * @param primary_terrain the primary_terrain to set
	 */
	public void setPrimary_terrain(Terrain primary_terrain) {
		this.primary_terrain = primary_terrain;
	}

}
