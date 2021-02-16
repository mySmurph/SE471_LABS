package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		List<Product> items = new ArrayList<Product>();
		items.add(new Product( 5715451, "Vintage Canvas Shoulder Laptop Bag", 49.99));
		items.add(new Product( 7989021, "Bentgo Bag - Insulated Lunch Box Bag", 9.99));
		items.add(new Product( 9379410, "Polyhedral 7-Die Scarab Dice Set", 9.41));
		items.add(new Product( 9249825, "Deluxe Reusable Grocery Bag w/ Bottle Sleeves", 25.95));
		items.add(new Product( 4729011, "Coleman Tent Kit", 12.97));
		items.add(new Product( 7400234, "Flashlight Holster", 7.85));
		items.add(new Product( 3958646, "Premium Bookends for Shelves", 17.73));
		items.add(new Product( 8050622, "Dungeon & Dragons: Dungeon Master's Guide 4E", 35.10));
		items.add(new Product( 5169007, "Lies My Teacher Told Me: History Textbook", 18.08));
		items.add(new Product( 8277821, "Vintage Travel Casual Daypack", 26.74));
		items.add(new Product( 6245816, "Batman Vol. 5: Zero Year - Dark City", 11.13));
		items.add(new Product( 1165822, "Lamentations of the Flame Princess", 17.08));

		ISortingUtility sul = SuperSortingUtility.getSortingUtility();
		Scanner scanner = new Scanner(System.in);
		int menuSelection;
		do {
			printMenu();
			menuSelection = scanner.nextInt();
			switch(menuSelection) {
			case 1: case 2: items = sul.sort(items, menuSelection);
							break;
			case 3:			shuffleList((List)items);
			case 4:			printList(items);
							break;
							default: break;
			}
			
		}while(menuSelection != 0);

	}
	
	/**
	 * print driver menu
	 */
	public static void printMenu() {

		System.out.println("\n-----------------------------------------");
		System.out.printf("%-19s [%d] %-20s\n","Menu:", 0, "Exit");
		System.out.printf("[%d] %-15s [%d] %-20s\n", 1, "Sort BubleSort", 3, "Shuffle & Print List");
		System.out.printf("[%d] %-15s [%d] %-20s\n", 2, "Sort QuickSort", 4, "Print List");
		System.out.println("-----------------------------------------");
		System.out.print("Selection: ");
		
	}
	
	/**
	 * print product list using System.out.println(Product::toString())
	 * @param items
	 */
	public static void printList(List<Product> items) {
		System.out.println("** Default print using System.out.println(Prodct::toString())");
		for(Object item: items) {
			System.out.println(item.toString());
		}
	}
	
	/**
	 * Shuffle List
	 * @param items
	 */
	public static void shuffleList(List<Object> items) {
		System.out.println("\n** Shuffle List");
		int limmit = items.size();
		for(int i = 0; i < limmit; i++) {
			int ii = (int)Math.abs((i+Math.random()*(limmit-1-i)));
			Collections.swap(items, i, ii);
		}
	}

}
