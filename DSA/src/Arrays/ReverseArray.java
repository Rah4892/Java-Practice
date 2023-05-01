package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr2 = {10,20,30,40,50};
        print(arr);
        print(arr2);
        swap(arr2);
        swap(arr);
        print(arr2);
        print(arr);
    }

    private static void print(int[] arr) {
        System.out.println();
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    private static void swap(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n/2;i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }

}
