package day3;

public class BankService
{
	public void validateBalance(double amtBal,double amtWdr)
	{
		System.out.println("bal validation start");
		
		if(amtBal>amtWdr)
		{
			System.out.println("please collect your money");
			amtBal-=amtWdr;
		}
		else
		{
			try {
				throw new InsufficientBalanceException("insufficent fund");
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("available balance = "+amtBal);
		System.out.println("bal validation end");
	}

}
