public class RearrangeArray {
    public static void main(String[] args) {
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        printArray(arr);
        rearrange(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void rearrange(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                if(arr[j] == i) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }
    }
}
