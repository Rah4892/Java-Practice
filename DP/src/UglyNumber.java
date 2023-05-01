public class UglyNumber {
    public static void main(String[] args) {
        int n =7;
        findNthUgly(n);
    }

    public static void findNthUgly(int n) {
        int count = 1;
        int i =1;
        while (count < n) {
            i++;
            if (isUgly(i)) {
                count++;
            }
        }
        System.out.println(i);
    }

    public static boolean isUgly(int i) {
        i = divide(i, 2);
        i = divide(i, 3);
        i = divide(i, 5);

        return (i == 1) ? true : false;
    }

    private static int divide(int x, int y) {
        while( x % y == 0) {
            x = x/y;
        }
        return x;
    }
}
