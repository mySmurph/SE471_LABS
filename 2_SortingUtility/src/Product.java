package src;

public class Product {
	
	/**
	 * general product ID 
	 */
	private int productID;
		
	/**
	 * general product price s
	 */
	private String productName;
	
	/**
	 * 
	 */
	private float productPrice;
		
	/**
	 * Overloaded constructor
	 * @param productID		the product ID
	 * @param productName	the product name
	 * @param productPrice	the product price
	 */
	public Product(int productID, String productName, double productPrice) {
		this(productID, productName, (float) productPrice);
	}
	public Product(int productID, String productName, float productPrice) {
		// TODO Auto-generated constructor stub
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	/**
	 * @return the productID
	 */
	public int getProductID(){
		return productID;
	}
	
	/**
	 * @return the product name
	 */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * @return the product price
	 */
	public float getProductPrice() {
		return productPrice;
	}

	/**
	 * @param name the name to set
	 */
	public void setProductName(String name) {
		this.productName = name;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setProductPrice(float price) {
		this.productPrice = price;
	}

	/**
	 * @return String that describes the product
	 */
	public String toString() {
		return String.valueOf(productID) + " - " + productName + " - $" + String.valueOf(productPrice); 
	}
}
