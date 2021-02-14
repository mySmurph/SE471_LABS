package src;

import java.util.ArrayList;

public class SortingUtility {

	public SortingUtility() {}
	
	public ArrayList<Product> sort(ArrayList<Product> items, int sortingApproach){
		switch(sortingApproach) {
		case 1:		return bubbleSort(items);
		case 2: 	return quickSort(items);
		}
		return items;
	}
	
	private ArrayList<Product> bubbleSort(ArrayList<Product>  items){
		return items;
	}
	
	private ArrayList<Product> quickSort(ArrayList<Product>  items){
		return items;
	}

}
