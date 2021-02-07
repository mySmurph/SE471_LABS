package Route;

public class Highway extends Route {
	
	enum CardinalDirection{
		NORTH_SOUTH,
		EAST_WEST,
		NORTHWEST_SOUTHEAST,
		NORTHEAST_SOUTHWEST
	}	
	
	private CardinalDirection direction;
	private int speed_limit;

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
