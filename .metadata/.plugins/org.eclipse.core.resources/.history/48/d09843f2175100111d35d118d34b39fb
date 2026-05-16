package multithreading;

class TicketService implements Runnable
{
	
	int numOfSeats = 3;
	
	public synchronized void bookSeats() throws InterruptedException
	{
		if(numOfSeats==0)
		{
			throw new RuntimeException("House Full");
		}
		System.out.println(Thread.currentThread()+ " has selected seat "+numOfSeats);
		Thread.sleep(2000);
		System.out.println(Thread.currentThread()+ " has made payment "+numOfSeats);
		Thread.sleep(2000);
		System.out.println(Thread.currentThread()+ " has booked seat "+numOfSeats);		
		numOfSeats-=1;	
		
	}

	@Override
	public void run() {
		try {
			bookSeats();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

public class TicketBookingMain 
{
	public static void main(String[] args) 
	{
		TicketService ts = new TicketService();
		Thread user1 = new Thread(ts,"sarfaraz");
		Thread user2 = new Thread(ts,"manvi");
		Thread user3 = new Thread(ts,"anamika");
		Thread user4 = new Thread(ts,"syed");
		
		user3.setPriority(10);
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		
	}

}
