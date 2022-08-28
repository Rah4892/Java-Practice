public class Recursion {
    public static void display(int n) {
        if (n>0){
            display(n-1);
            System.out.println("n= "+n);
        }
    }

    public static int factorial(int m) {
        if (m == 0 || m==1) {
            return 1;
        }
        else {
            return m * factorial(m-1);
        }
    }
    public static void main(String[] args) {
        int n=5;
        display(n);
        int result = factorial(5);
        System.out.println("factorial ="+ result);
    }
}
