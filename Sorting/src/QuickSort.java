public class QuickSort {
    public static void main(String[] args) {
        //int[] arr = {6,8,1,4,5,3,7,2};
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        int n = arr.length;
        printArr(arr);
        quickSort(arr,0,n-1);
        printArr(arr);
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            //pivot element will
            int pivot = partition(arr, start, end);

            //recursively call quickSort on the two parts of the array
            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot+1, end);
        }
    }

    //method to partition the array around pivot element
    static int partition(int[] arr, int start, int end) {

        //we select pivot element as the first element in each call
        int pivot = arr[end];
        int i=start;

        for(int j=start;j<end;j++) {
            //move i to right if element is less than pivot
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        //swap(arr, i, end);
        return i-1;
    }

    //function to swap elements in the array
    static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    static void printArr(int[] arr) {
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            System.out.print(" " +arr[i]);
        }
    }
}
