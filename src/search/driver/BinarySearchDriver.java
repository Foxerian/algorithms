package search.driver;

import search.BinarySearch;

public class BinarySearchDriver {
    BinarySearch bs;
    public BinarySearchDriver() {
        bs = new BinarySearch();

    }

    public void execute() {
        int arr[] = {1,2,4,6,7,8,10};
        System.out.println("Searching for 7 found at index:"+bs.search(arr,7));
        int arr1[] = {1,2,4,6,7,8,10,15};
        System.out.println("Searching for 15 found at index:"+bs.search(arr1,15));
        System.out.println("Searching for 7 found at index:"+bs.search(arr1,7));
        System.out.println("Searching for 7 found at index:"+bs.search(arr1,5));
    }
}


