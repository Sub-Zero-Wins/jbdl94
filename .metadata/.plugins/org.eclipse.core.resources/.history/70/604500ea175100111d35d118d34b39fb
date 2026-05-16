package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {

    public static void main(String[] args) {
        // Create a pool of 1 thread
        ExecutorService executor = Executors.newSingleThreadExecutor(); // ; // Runnable task = new WorkerThread("Task ");/ Thread t1 = new Thread(task)/ t1.start()

        // Creating a Runnable Class
            Runnable task = new WorkerThread("Task ");
// Submit the task specified by the runnable to the executor service
            executor.submit(task);
            
            executor.shutdown(); // Waits for all tasks to complete
         // OR
       //  executor.shutdownNow();// 	// Attempts to stop all tasks immediately



       }
}

class WorkerThread implements Runnable {
    private String taskName;

    public WorkerThread(String taskName) {
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
