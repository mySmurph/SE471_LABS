package src;

import java.util.List;
import java.util.Collections;

public class SortingUtility implements ISortingUtility {
	
	/**
	 * Sort a list of Products
	 * @param	items list of products to be sorted
	 * @param	sortingApproach the sort method to be used 1 = bubble sort, 2 = quick sort  	
	 */
	public List<Product> sort(List<Product> items, int sortingApproach){
		switch(sortingApproach) {
		case 1:		items = bubbleSort(items);
					break;
		case 2: 	items = quickSort(items);
					break;
		default:	break;
		}
		return items;
	}
	
	/**
	 * Sort Product list using bubble sort algorithm
	 * @param	items list of products to be sorted
	 * @return the sorted list
	 */
	private List<Product> bubbleSort(List<Product>  items){
		int max = items.size();
		for(int i = 0; i < max-1; i++) {
			for(int ii = i+1; ii < max ; ii++) {
				if(items.get(i).getProductID() > items.get(ii).getProductID()) {
					Collections.swap(items, i, ii);
				}
			}
		}
		return items;
	}
	
	/**
	 * Sort Product list using quick sort algorithm
	 * @param	items list of products to be sorted
	 * @return the sorted list
	 */
	private List<Product> quickSort(List<Product>  items){
		quickSort(items, 0, items.size()-1);
		return items;
	}
	
	/**
	 * sort list recursively
	 * @param items the list of items
	 * @param first starting index
	 * @param last	ending index
	 */
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
}
