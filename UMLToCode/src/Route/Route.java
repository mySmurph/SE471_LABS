package Route;

class Route {
	
	private Address start_point;
	private Address end_point;

	public Route(Address start, Address end) {
		this.setStart_point(start);
		this.setEnd_point(end);
	}

	/**
	 * @return the start_point
	 */
	public Address getStart_point() {
		return start_point;
	}

	/**
	 * @param start_point the start_point to set
	 */
	public void setStart_point(Address start_point) {
		this.start_point = start_point;
	}

	/**
	 * @return the end_point
	 */
	public Address getEnd_point() {
		return end_point;
	}

	/**
	 * @param end_point the end_point to set
	 */
	public void setEnd_point(Address end_point) {
		this.end_point = end_point;
	}
	

}
