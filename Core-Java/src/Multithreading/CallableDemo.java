package Multithreading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class CallableSetup implements Callable {

    @Override
    public Object call() throws Exception {
        Random generator = new Random();
        int randomNumber = generator.nextInt(5);
        return randomNumber;
    }
}

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask[] tasks = new FutureTask[5];

        for(int i=0;i<5;i++) {
            CallableSetup obj = new CallableSetup();
            tasks[i] = new FutureTask(obj);

            Thread t1 = new Thread(tasks[i]);
            t1.start();
        }

        for(int i=0;i<5;i++) {
            System.out.println(tasks[i].get());
        }
    }
}
