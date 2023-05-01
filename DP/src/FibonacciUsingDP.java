public class FibonacciUsingDP {
    public static void main(String[] args) {
        int n = 10;
        findFib(n);
    }

    static void findFib(int n) {
        int[] fib = new int[n+2];
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2;i<=n;i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println(fib[n]);
    }
}
