package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9,3,1,5,12,13};
        int n = arr.length;
        printArray(arr, n);
        mergeSort(arr, n);
        printArray(arr, n);
    }

    private static void printArray(int[] arr, int n) {
        System.out.println();
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]);
        }
    }

    private static void mergeSort(int[] arr, int n) {

    }
}
