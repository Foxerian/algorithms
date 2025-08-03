package search;

public class BinarySearch {
    int array[];
    int find;
    public BinarySearch() {

    }

    public int search(int[] arr, int find) {
        int mid;
        int first = 0, last = arr.length;
        while(first<=last){
            // This is done to avoid exceed integer limits due to addition
            mid = last + (first - last)/2;
            if(arr[mid] == find){
                return mid;
            } else if(arr[mid] < find) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }
}
