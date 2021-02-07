package Route;

public class Address {

	private String street_address;
	private String city;
	private String state_providence;
	private String country;
	public Address(String street_address, String city, String state_providence, String country) {
		this.street_address = street_address;
		this.city = city;
		this.state_providence = state_providence;
		this.country = country;
	}
	
	public void print() {
		System.out.printf("%s\n%s, %s %s", street_address,  city, state_providence, country);
	}

}
