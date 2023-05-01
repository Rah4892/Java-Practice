package Multithreading;

public class PrintOddEven {
    int counter =1;
    int n = 100;
    public static void main(String[] args) {

        PrintOddEven obj = new PrintOddEven();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.printEven();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.printOdd();
            }
        });

        t1.start();
        t2.start();
    }

    private void printEven() {
        synchronized (this) {
            while(counter < n) {
                if (counter%2 == 1) {
                    try{
                        wait();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter);
                counter++;
                notify();
            }

        }
    }

    private void printOdd() {
        synchronized (this) {
            while(counter < n) {
                if (counter%2 == 0) {
                    try{
                        wait();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter);
                counter++;
                notify();
            }

        }
    }
}
