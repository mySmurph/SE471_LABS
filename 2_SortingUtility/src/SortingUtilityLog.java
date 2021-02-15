package src;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public class SortingUtilityLog implements ISortingUtility {
	
	private SortingUtility sortingUtil_original;
	private Class suClass;
	private Method sortMethod;

	public SortingUtilityLog(SortingUtility su) {
		this.sortingUtil_original = su;
	}
	
	private void reflection() throws NoSuchMethodException, InvocationTargetException{
		suClass = sortingUtil_original.getClass();
		sortMethod = suClass.getMethod("bubbleSort");
	}
	
	public List<Product> sort(List<Product> items, int sortingApproach){
		try {
			this.reflection();
			switch(sortingApproach) {
			case 1:		items = bubbleSort(items);
				break;
			case 2: 	items = quickSort(items);
				break;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
		return items;
	}
	
	private List<Product> bubbleSort(List<Product>  items){
		int max = items.size();
		for(int i = 0; i < max-1; i++) {
			for(int ii = i+1; ii < max ; ii++) {
				if(items.get(i).getProductID() > items.get(ii).getProductID()) {
					Collections.swap(items, i, ii);
				}
			}
		}
		bubbleSortPrint(items);
		return items;
	}
	
	private List<Product> quickSort(List<Product>  items){
		quickSort(items, 0, items.size()-1);
		quickSortPrint(items);
		return items;
	}
	
	private void quickSort(List<Product>  items, int first, int last) {
		int i = first;
		int ii = last;
		int pivotID = items.get((first + last)/2).getProductID();
		do {
			while(items.get(i).getProductID() < pivotID)
				i++;
			while(items.get(ii).getProductID() > pivotID)
				ii--;
			if(i <= ii) {
				Collections.swap(items, i, ii);
				i++;
				ii--;
			}
			
		}while(i <= ii);
		
		if(first < ii)
			quickSort(items, first, ii);
		if(i < last)
			quickSort(items, i, last);
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
