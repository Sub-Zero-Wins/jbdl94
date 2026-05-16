package multithreading;

class StaticDisplay {
    // Static method that uses a synchronized block for class-level locking
    public static void showMessage(String message) {
    	synchronized (StaticDisplay.class) { // Locks the StaticDisplay class
        	for (int i = 0; i < 5; i++) {
                System.out.print("[");
            	System.out.print(message);
                System.out.println("]");
            	try {
                	Thread.sleep(500); // Sleep for half a second
            	} catch (InterruptedException e) {
                	e.printStackTrace();
            	}
        	}
    	}
    }
}
 
class StaticMessageThread extends Thread {
    private String message;
 
    // Constructor to initialize the message
    public StaticMessageThread(String message) {
    	this.message = message;
    }
 
    // Overridden run method to call the static showMessage method of StaticDisplay
    @Override
    public void run() {
    	StaticDisplay.showMessage(message);
    }
}
 
public class ClassLevelLockBlock {
    public static void main(String[] args) {
    	// Creating two threads that will use the same class-level lock
    	StaticMessageThread t1 = new StaticMessageThread("Thread1");
    	StaticMessageThread t2 = new StaticMessageThread("Thread2");
 
    	t1.start(); // Start thread t1
    	t2.start(); // Start thread t2
    }
}
