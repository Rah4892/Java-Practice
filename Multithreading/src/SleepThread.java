public class SleepThread extends Thread{
    public void run() {
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleepThread thread1 = new SleepThread();
        SleepThread thread2 = new SleepThread();
        thread1.start();
        thread2.start();

    }
}
