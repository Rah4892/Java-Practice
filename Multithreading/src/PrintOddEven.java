public class PrintOddEven implements Runnable{
    static int counter = 1;
    static int remainder = 0;
    static Object lock = new Object();

    @Override
    public void run() {
        while(counter <= 10) {
            synchronized (lock) {
                while(counter %2!= 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + counter);
                counter++;
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        PrintOddEven oddObject = new PrintOddEven(1);
        PrintOddEven evenObject = new PrintOddEven(0);
        Thread oddThread = new Thread(oddObject, "Odd");
        Thread evenThread = new Thread(evenObject, "Even");

        oddThread.start();
        evenThread.start();
    }

    PrintOddEven(int remainder) {
        this.remainder = remainder;
    }
}
