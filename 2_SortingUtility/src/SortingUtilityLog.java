package src;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class SortingUtilityLog implements ISortingUtility {
	/**
	 * the original class that this is based on
	 */
	private ISortingUtility sortingUtil_original;

	/**
	 * Constructor
	 * @param su 
	 */
	public SortingUtilityLog(ISortingUtility su) {
		this.sortingUtil_original = su;
	}
	
	/**
	 * Get the specified sort method
	 * @param method
	 * @return Method, the found method
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 */
	private Method reflectionSortMethod(String method) throws NoSuchMethodException, InvocationTargetException{
		Method sortMethod = sortingUtil_original.getClass().getDeclaredMethod(method, List.class);
		sortMethod.setAccessible(true);
		return sortMethod;
	}
	
	/**
	 * Sort a list of Products
	 * @param	items list of products to be sorted
	 * @param	sortingApproach the sort method to be used 1 = bubble sort, 2 = quick sort  	
	 */
	public List<Product> sort(List<Product> items, int sortingApproach){
		try {

			switch(sortingApproach) {
				case 1:		items = (List<Product>) (this.reflectionSortMethod("bubbleSort")).invoke(sortingUtil_original, items);	
							bubbleSortPrint(items);
							break;
				case 2:		items = (List<Product>) (this.reflectionSortMethod("quickSort")).invoke(sortingUtil_original, items);
							quickSortPrint(items);
							break;
				default:	break;
			}
		}catch (NoSuchMethodException e) {
			System.out.println("No Such Method");
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {}
		return items;
	}
	
	/**
	 * Print the formatted list
	 * @param items
	 */
	private void bubbleSortPrint(List<Product> items) {
		System.out.println("\nBubble Sort Called");
		System.out.printf("%-11s %-50s %-7s\n", "Product ID", "Product Name", "Price");
		System.out.printf("%-11s %-50s %-7s\n", "----------", "------------", "-----");
		for(Product item: items) {
			System.out.printf("%-11d %-50s $%6.2f\n", item.getProductID(), item.getProductName(), item.getProductPrice());
		}
	}
	
	/**
	 * Print the formatted list
	 * @param items
	 */
	private void quickSortPrint(List<Product> items) {
		System.out.println("\nQuick Sort Called");
		System.out.printf("%-50s %-11s %-7s\n", "Product Name", "Product ID", "Price");
		System.out.printf("%-50s %-11s %-7s\n", "------------", "----------", "-----");
		for(Product item: items) {
			System.out.printf("%-50s %-11d $%6.2f\n", item.getProductName(), item.getProductID(), item.getProductPrice());
		}
	}
}
