package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {
    public static void main(String[] args) {
        // Create a cached thread pool
        ExecutorService executor = Executors.newCachedThreadPool();
 
        // Submit 5 tasks to the executor
        for (int i = 1; i <= 10; i++) {
            Runnable task = new WorkerThread("Task " + i);
            executor.submit(task);
        }
        // Shut down the executor
        executor.shutdown();
    }
}
class WorkerThread2 implements Runnable {
    private String taskName;
 
    public WorkerThread2(String taskName) {
        this.taskName = taskName;
    }
 
    @Override
    public void run()  {
        System.out.println(Thread.currentThread().getName() + " is executing " + taskName);
        try {
            Thread.sleep(2000);  // Simulating work by sleeping for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished " + taskName);
    }
}

