package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task1 implements Callable
{

	@Override
	public String call() throws Exception 
	{
		for (int i = 0; i <5; i++) {
			System.out.println(Thread.currentThread().getName()+" is executing");
		}

		return new String("DONE");
	}


}


public class CallableDemo 
{
	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		 Task1 t1= new Task1();
         ExecutorService e=Executors.newSingleThreadExecutor();
         
         
      Future<String> f  = e.submit(t1);
      
      e.shutdown();
      if(f.isDone())
      {
    	  System.out.println(f.get());
     }

	}
}
