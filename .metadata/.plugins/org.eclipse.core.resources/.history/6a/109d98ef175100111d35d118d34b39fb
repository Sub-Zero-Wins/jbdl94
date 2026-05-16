package multithreading;


class Queue
{
	int x ;
	boolean valueIsPresent=false;
	
	synchronized public void put(int j)
	{
		if(valueIsPresent==true)
		{  
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			x=j;
			System.out.println(" I have put into x "+x);
			notify();
			valueIsPresent=true;
		}
	
	}
	synchronized public void get()
	{
		if(valueIsPresent==false)
		{  
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println(" I Have taken from x "+x);
			valueIsPresent=false;
			notify();
		}
	}
}

class Producer extends Thread
{
	Queue q;


	Producer(Queue q)
	{
		this.q=q;
	}
	public void run()
	{
		int i=1;

		while(i<=100)
		{
			q.put(i++);
		}
	}
}
class Consumer extends Thread
{
	Queue q;


	Consumer (Queue q)
	{
		this.q=q;
	}
	public void run()
	{


		while(true)
		{
			q.get();
		}
	}
}

public class ProducerConsumer 
{

  public static void main(String[] args) {
	  {
		  Queue q= new Queue();
		  Producer p=new Producer(q);
		  Consumer c=new Consumer(q);
		  p.start();
		  c.start();
		  
		  
	  }
}
}
