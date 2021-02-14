package src;

import java.util.ArrayList;
import java.util.Collections;

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
		int max = items.size();
		for(int i = 0; i < max-1; i++) {
			for(int ii = i+1; ii < max ; ii++) {
				if(items.get(i).getproductID() < items.get(ii).getproductID()) {
					Collections.swap(items, i, ii);
				}
			}
		}
		return items;
	}
	
	private ArrayList<Product> quickSort(ArrayList<Product>  items){
		quickSort(items, 0, items.size());
		return items;
	}
	
	private void quickSort(ArrayList<Product>  items, int first, int last) {
		int temp;
		int i = first;
		int ii = last;
		int pivotID = items.get((first + last)/2).getproductID();
		do {
			while(items.get(i).getproductID() < pivotID)
				i++;
			while(items.get(ii).getproductID() > pivotID)
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
