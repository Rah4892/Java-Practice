package ExecutorFramework;

public class WorkerThreadClass implements Runnable{
    private String message;
    public WorkerThreadClass(String s) {
        this.message = s;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) task:"+ message);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" (End) ");
    }
}
