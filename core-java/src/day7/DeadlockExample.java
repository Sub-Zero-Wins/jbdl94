package day7;

class CounterStrike extends Thread
{
	String weapon1="maverick";
	String weapon2="ak-47";
	String weapon3="grenade";
	
	public void run()
	{
		if(getName().equals("mike"))
		{
			try {
				mikeAccWeapons();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(getName().equals("rocky"))
		{
			try {
				rockyAccWeapons();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void mikeAccWeapons() throws InterruptedException {
		synchronized(weapon1)
		{
			System.out.println(" mike has accuired "+weapon1);
			Thread.sleep(1000);
			synchronized(weapon2)
			{
				System.out.println(" mike has accuired "+weapon2);
				Thread.sleep(1000);
				synchronized(weapon3)
				{
					System.out.println(" mike has accuired "+weapon3);
					Thread.sleep(1000);
					
				}
				
			}
			
		}
		
	}

	private void rockyAccWeapons() throws InterruptedException {
		synchronized(weapon3)
		{
			System.out.println(" rocky has accuired "+weapon3);
			Thread.sleep(1000);
			synchronized(weapon2)
			{
				System.out.println(" rocky has accuired "+weapon2);
				Thread.sleep(1000);
				synchronized(weapon1)
				{
					System.out.println(" rocky has accuired "+weapon1);
					Thread.sleep(1000);
					
				}
				
			}
			
		}
		
		
	}
	
}

public class DeadlockExample 
{
  public static void main(String[] args)
  {
	  CounterStrike t1 = new CounterStrike();
	  CounterStrike t2= new CounterStrike();
	  t1.setName("mike");
	  t2.setName("rocky");
	  t1.start();
	  t2.start();
  }
}
