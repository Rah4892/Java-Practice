public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6,8,1,4,5,3,7,2};
        printArr(arr);
        insertionSort(arr);
        printArr(arr);
    }

    static void insertionSort(int[] arr) {
        int i, j, pivot;
        for(i=2;i<arr.length;i++) {
            pivot = arr[i];
            j=i;
            while( j>0 && arr[j-1] > pivot) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = pivot;
        }
    }

    static void printArr(int[] arr) {
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
}
