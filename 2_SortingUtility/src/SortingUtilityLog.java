package src;

import java.util.List;

public class SortingUtilityLog extends SortingUtility {

	public SortingUtilityLog() {}

	public List<Product> sort(List<Product> items, int sortingApproach){
		items = super.sort(items, sortingApproach);
		switch(sortingApproach) {
		case 1:		bubbleSortPrint(items);
				break;
		case 2: 	quickSortPrint(items);
				break;
		}
		return items;
	}
	
	
	private void bubbleSortPrint(List<Product> items) {
		System.out.println("\nBubble Sort Called");
		System.out.printf("%-11s %-50s %-7s\n", "Product ID", "Product Name", "Price");
		System.out.printf("%-11s %-50s %-7s\n", "----------", "------------", "-----");
		for(Product item: items) {
			System.out.printf("%-11d %-50s $%6.2f\n", item.getProductID(), item.getProductName(), item.getProductPrice());
		}
	}
	private void quickSortPrint(List<Product> items) {
		System.out.println("\nQuick Sort Called");
		System.out.printf("%-50s %-11s %-7s\n", "Product Name", "Product ID", "Price");
		System.out.printf("%-50s %-11s %-7s\n", "------------", "----------", "-----");
		for(Product item: items) {
			System.out.printf("%-50s %-11d $%6.2f\n", item.getProductName(), item.getProductID(), item.getProductPrice());
		}
	}
	
}
