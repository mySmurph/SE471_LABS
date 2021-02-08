public class Address {

	/**
	 * street address
	 * "285 J St"
	 */
	private String street_address;
	
	/**
	 * city
	 * "San Diego"
	 */
	private String city;
	
	/**
	 * state or providence
	 * "California"
	 */
	private String state_providence;
	
	/**
	 * postal code
	 * "92101"
	 */
	private String  postal_code;
	
	/**
	 * country
	 * "USA"
	 */
	private String country;
	
	/**
	 * constructor
	 * @param street_address
	 * @param city
	 * @param state_providence
	 * @param postal_code
	 * @param country
	 */
	public Address(String street_address, String city, String state_providence, String postal_code, String country) {
		this.street_address = street_address;
		this.city = city;
		this.state_providence = state_providence;
		this.postal_code = postal_code;
		this.country = country;
	}
	
	/**
	 * print formated address
	 * 285 J St
	 * San Diego, CA 92101
	 * USA
	 */
	public void print() {
		System.out.printf("%s\n%s, %s %s\n%s", street_address,  city, state_providence, postal_code, country);
	}

}
