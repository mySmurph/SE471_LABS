package src;

import java.util.List;
import java.util.Collections;

public class SortingUtility implements ISortingUtility {

	public SortingUtility() {}
	
	public List<Product> sort(List<Product> items, int sortingApproach){
		switch(sortingApproach) {
		case 1:		items = bubbleSort(items);
			break;
		case 2: 	items = quickSort(items);
			break;
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
		return items;
	}
	
	private void foo(int x, int y) {
		System.out.println("--- Foo found ---");
	}
	
	private List<Product> quickSort(List<Product>  items){
		quickSort(items, 0, items.size()-1);
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

}
