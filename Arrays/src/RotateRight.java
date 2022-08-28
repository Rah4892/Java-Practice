public class RotateRight {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        printArray(arr);
        int k = 2;
        for(int i=1;i<=k;i++) {
            rotateRight(arr);
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotateRight(int arr[]) {
        int temp = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--) {
            arr[i] = arr[i-1];
        }
        arr[0]= temp;
    }
}
