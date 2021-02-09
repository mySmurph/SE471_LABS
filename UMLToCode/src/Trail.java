public class Trail extends Route {

	/**
	 * enumeration type of different terrains a trail can be  
	 */
	public enum Terrain {
		FOOT_TRAIL,
		BIKEWAY,
		BOARDWALK,
		NATURE, 
		MULTI_USE
		
	}

	/**
	 * name of the park the trail goes through
	 */
	private String park_name;
	
	/**
	 * terrain of the trail
	 */
	private Terrain primary_terrain;
	
	/**
	 * constructor
	 * @param start the Address of the route's start_point
	 * @param end	the Address of the route's end_point
	 * @param park_name	name of the park the trail goes through
	 * @param primary_terrain	terrain of the trail
	 */
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
