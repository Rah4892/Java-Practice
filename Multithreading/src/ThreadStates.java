public class ThreadStates {
    public static void main(String[] args) {
        Thread thread1 = new Thread();
        System.out.println(thread1.getState());

        thread1.start();
        System.out.println(thread1.getState());

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread1.getState());
    }
}
