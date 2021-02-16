package src;

public class SuperSortingUtility {
	
	public static ISortingUtility getSortingUtility(){
		return new SortingUtilityLog(new SortingUtility());
	}

}
