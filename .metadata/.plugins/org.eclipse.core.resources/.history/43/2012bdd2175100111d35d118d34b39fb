package multithreading;

import java.util.concurrent.*;

public class CallableAndFutureExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        // Submit a Callable task
        Future<Integer> future = executor.submit(new MyCallableTask(5));
        
        try {
            // Check if the task is done
            if (!future.isDone()) {
                System.out.println("Task is still running...");
            }
            System.out.println("Other tasks");
            // Get the result of the task (blocks until result is ready)
            Integer result = future.get();
            System.out.println("Result of task: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
       
    }
}

