public class ThreadClass extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is running");
    }
    public static void main(String[] args) {
        ThreadClass thread1 = new ThreadClass();
        System.out.println(Thread.currentThread().getName()+" is running from main method");
        thread1.start();
        //thread1.run();
    }
}
