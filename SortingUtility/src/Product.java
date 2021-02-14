
public class Product {
	
	/**
	 * general product ID 
	 */
	private String productID;
	
	
	/**
	 * general product price 
	 */
	private String productName;
	
	/**
	 * 
	 */
	private float productPrice;
	
	
	/**
	 * constructor
	 * @param productID		the product ID
	 * @param productName	the product name
	 * @param productPrice	the product price
	 */
	public Product(String productID, String productName, float productPrice) {
		// TODO Auto-generated constructor stub
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	
	/**
	 * @return the productID
	 */
	public String getproductID(){
		return productID;
	}
	
	/**
	 * @return the product name
	 */
	public String getproductName() {
		return productName;
	}
	
	/**
	 * @return the product price
	 */
	public float getproductPrice() {
		return productPrice;
	}

	
	/**
	 * @param name the name to set
	 */
	public void setproductName(String name) {
		this.name = name;
	}
	
	/**
	 * @param price the price to set
	 */
	
	public void setProductPrice(float price) {
		this.productPrice = price;
	}
	
}
