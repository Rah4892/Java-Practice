public class JoinThreads extends Thread{
    public static void main(String[] args) {
        JoinThreads thread1 = new JoinThreads();
        JoinThreads thread2 = new JoinThreads();
        JoinThreads thread3 = new JoinThreads();
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();
    }

    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
