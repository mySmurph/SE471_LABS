public class Highway extends Route {
	
	/**
	 * enumeration of the Cardinal Directions
	 */
	enum CardinalDirection{
		NORTH,
		SOUTH,
		EAST,
		WEST,
		NORTHWEST, 
		NORTHEAST,
		SOUTHWEST,
		SOUTHEAST
	}	
	
	/**
	 * general direction to travel down the highway
	 */
	private CardinalDirection direction;
	
	/**
	 * the speed limit of the highway
	 */
	private int speed_limit;

	/**
	 * constructor
	 * @param start the Address of the route's start_point
	 * @param end	the Address of the route's end_point
	 * @param direction	general direction to travel down the highway
	 * @param speed_limit	the speed limit of the highway
	 */
	public Highway(Address start, Address end, CardinalDirection direction, int speed_limit) {
		super(start, end);
		this.setDirection(direction);
		this.setSpeed_limit(speed_limit);
	}

	/**
	 * @return the direction
	 */
	public CardinalDirection getDirection() {
		return direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(CardinalDirection direction) {
		this.direction = direction;
	}

	/**
	 * @return the speed_limit
	 */
	public int getSpeed_limit() {
		return speed_limit;
	}

	/**
	 * @param speed_limit the speed_limit to set
	 */
	public void setSpeed_limit(int speed_limit) {
		this.speed_limit = speed_limit;
	}

}
