package ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolClass {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=1;i<10;i++) {
            Runnable worker = new WorkerThreadClass(""+i);
            executorService.execute(worker);
        }
        executorService.shutdown();
        while(!executorService.isTerminated()) {

        }
        System.out.println("Finished threads");
    }
}
