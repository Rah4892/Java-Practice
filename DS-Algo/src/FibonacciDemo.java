import java.util.Arrays;

public class FibonacciDemo {
    static int calcFib(int n, int[] storedVal) {
        if (n <=1) return n;

        if (storedVal[n] != -1) return storedVal[n];

        return storedVal[n] = calcFib(n-1, storedVal) + calcFib(n-2, storedVal);
    }

    public static void main(String[] args) {
        int n= 10;
        int[] storedVal = new int[n+1];
        Arrays.fill(storedVal, -1);
        System.out.println("Fib of"+" n="+calcFib(n, storedVal));

        //Another approach is using two prev pointers
        //since we only need the values of last two fibonacci series
        //the remaining are not required to calculate hence saving space

        int num = 10;
        int prev1 = 1;
        int prev2 = 0;

        for (int i=2;i<=num;i++) {
            int temp = prev1 + prev2;
            prev2 = prev1;
            prev1 = temp;
        }
        System.out.println("Result:" + prev1);
    }
}
