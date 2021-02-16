package src;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public class SortingUtilityLog implements ISortingUtility {
	
	private SortingUtility sortingUtil_original;
//	private Method sortMethod;

	public SortingUtilityLog(SortingUtility su) {
		this.sortingUtil_original = su;
	}
	
	private Method reflectionSortMethod(String method) throws NoSuchMethodException, InvocationTargetException{
		Method sortMethod = sortingUtil_original.getClass().getDeclaredMethod(method, List.class);
		sortMethod.setAccessible(true);
		return sortMethod;
//		System.out.println(sortMethod.toString());
	}
	
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
