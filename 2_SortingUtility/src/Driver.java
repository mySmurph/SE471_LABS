package src;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Product> items = new ArrayList<Product>();
		items.add(new Product( 5715451, "Vintage Canvas Leather Military Shoulder Laptop Bag", 49.99));
		items.add(new Product( 7989021, "Bentgo Bag - Insulated Lunch Box Bag Keeps Food Cold On The Go", 9.99));
		items.add(new Product( 9379410, "Polyhedral 7-Die Scarab Dice Set", 9.41));
		items.add(new Product( 9249825, "Simple Ecology Organic Cotton Deluxe Reusable Grocery Bag with Bottle Sleeves", 25.95));
		items.add(new Product( 4729011, "Coleman Tent Kit", 12.97));
		items.add(new Product( 7400234, "Flashlight Holster up to 170 mm/ 6.5 inches long with push button", 7.85));
		items.add(new Product( 3958646, "MaxGear Book Ends Universal Premium Bookends for Shelves", 17.73));
		items.add(new Product( 8050622, "Dungeon & Dragons: Dungeon Master's Guide - Roleplaying Game Core Rules, 4th Edition", 35.10));
		items.add(new Product( 5169007, "Lies My Teacher Told Me: Everything Your American History Textbook Got Wrong", 18.08));
		items.add(new Product( 8277821, "Vintage Travel Canvas Backpacks Laptop School Bookbags Military Rucksack Casual Daypack", 26.74));
		items.add(new Product( 6245816, "Batman Vol. 5: Zero Year - Dark City", 11.13));
		items.add(new Product( 1165822, "Vornheim the Complete City Kit, Lamentations of the Flame Princess", 17.08));

		
		
		SortingUtility su = new SortingUtility();
		System.out.println("Items");
		
		printItems(items);
		System.out.println("\nSort 2");
		printItems(su.sort(items, 2));
	}
	
	public static void printItems(List<Product> listOfItems) {
		for(Product item: listOfItems) {
			System.out.println(item.toString());
		}
	}

}
