public class RunnableClass implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread 1 is running");
    }

    public static void main(String[] args) {
        RunnableClass obj1 = new RunnableClass();
        Thread thread1 = new Thread(obj1);
        thread1.start();

        Runnable run1 = new RunnableClass();
        Thread thread2 = new Thread(run1, "Passed from new thread object");
        thread2.start();

        String str = thread2.getName();
        System.out.println("Name of thread:"+str);
    }
}
