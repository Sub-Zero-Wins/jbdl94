package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample2 {

    public static void main(String[] args) {
        // Create a pool of 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 5 tasks to the executor
        for (int i = 1; i <= 6; i++) {
            Runnable task = new WorkerThread("Task " + i);
            executor.submit(task);
        }

        // Shut down the executor
        executor.shutdown();
        
      //  executor.shutdownNow();
    }
}

class WorkerThread1 implements Runnable {
    private String taskName;

    public WorkerThread1(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing " + taskName);
        try {
            Thread.sleep(2000);  // Simulating work by sleeping for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished " + taskName);
    }
}
