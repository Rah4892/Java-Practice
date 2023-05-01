package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
        int element = 110;
        int n = arr.length;
        int result = binarySearch(arr, 0, n-1, element);
        if (result == -1)
            System.out.println();
    }

    private static int binarySearch(int[] arr, int start, int end, int element) {
        int n = arr.length;
        int mid;
        if(end >= 1) {
            if (n%2 == 0){
                mid = (start + end)/2 + 1;
            }
            else {
                mid = (start + end)/2;
            }


            //if element is middle element
            if (arr[mid] == element) {
                return mid;
            }

            //search in right of array
            else if (element > arr[mid]) {
                return binarySearch(arr, mid+1, end, element);
            }

            //search in left of array
            else
                return binarySearch(arr, 0, mid-1, element);
        }
        return -1;
    }
}
