package Multithreading;

class Counter implements Runnable {

    private int count = 0;

    private void increment() {
        count++;
    }

    private void decrement() {
        count--;
    }

    private int getCount() {
        return count;
    }
    @Override
    public void run() {
        //remove this synchronized block to see race condition
        synchronized (this) {
            this.increment();
            System.out.println("incremented - " + Thread.currentThread().getName() + " " + this.getCount());

            this.decrement();
            System.out.println("decremented - " + Thread.currentThread().getName() + " " + this.getCount());
        }
    }
}
public class RaceCondition {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter, "Thread1");
        Thread t2 = new Thread(counter, "Thread2");
        Thread t3 = new Thread(counter, "Thread3");

        t1.start();
        t2.start();
        t3.start();
    }
}
