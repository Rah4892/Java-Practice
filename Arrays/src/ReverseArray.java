import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        printArray(arr);
        reverseUsingStack(arr);
        //reverse(arr);
        printArray(arr);
    }

    private static void reverseUsingStack(int[] arr) {
        Stack<Integer> stack = new Stack();
        for(int i=0;i<arr.length;i++) {
            stack.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++) {
            arr[i] = stack.pop();
        }
    }

    public static void printArray(int[] arr) {
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverse(int[] arr) {
        int i = 0;
        int n = arr.length;
        int j = n-1;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
