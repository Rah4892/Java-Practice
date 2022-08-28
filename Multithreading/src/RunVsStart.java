public class RunVsStart extends Thread{

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        RunVsStart thread = new RunVsStart();
        //thread.start();


        thread.run();

    }

}
