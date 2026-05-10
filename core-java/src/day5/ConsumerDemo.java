package day5;

import java.util.Date;
import java.util.function.Consumer;

public class ConsumerDemo 
{
	public static void main(String[] args) 
	{
		Consumer<Date> getDate = d->System.out.println(d);
		
		getDate.accept(new Date());
		
		
	}

}
