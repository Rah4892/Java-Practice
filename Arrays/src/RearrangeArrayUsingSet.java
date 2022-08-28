import java.util.HashSet;
import java.util.Set;

public class RearrangeArrayUsingSet {
    public static void main(String[] args) {
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        rearrange(arr);
        printArray(arr);
    }

    public static void rearrange(int[] arr) {
        Set set = new HashSet();
        for(int i=0;i<arr.length;i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        for(int i=0;i<arr.length;i++) {
            if(set.contains(i)) {
                arr[i] = i;
            }
            else{
                arr[i] = -1;
            }
        }
    }

    public static void printArray(int[] arr) {
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
