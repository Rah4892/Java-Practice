package Sorting;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {5,1,4,2,8,6,3,7};
        int n = arr.length;
        bubbleSort(arr, n);
        printArray(arr, n);
        optimizedBubbleSort(arr, n);
        printArray(arr, n);

    }

    private static void bubbleSort(int[] arr, int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static void optimizedBubbleSort(int[] arr, int n) {
        //We don't need to run the loop if all the elements are swapped
        boolean isSwapped = false;
        for(int i=0;i<n;i++) {
            if (!isSwapped) {
                break;
            }
            for(int j=0;j<n-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }

            }
        }
    }

    private static void printArray(int[] arr, int n) {
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]);
        }
    }
}
