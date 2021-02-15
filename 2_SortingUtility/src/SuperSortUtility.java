package src;

public class SuperSortUtility {
	
	public static ISortingUtility getSortUtility(){
		return new SortingUtilityLog(new SortingUtility());
	}

}
