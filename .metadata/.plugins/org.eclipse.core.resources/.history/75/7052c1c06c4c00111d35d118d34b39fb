package streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 */
public class EkartDatabase 
{
	
	
	public static List<Customer> getAllCustomers()
	{
		return Stream.of(new Customer(101,"saqib","saqib@gmail.com",Arrays.asList("957890987","987698765")),
				         new Customer(102,"aqib","aqib@gmail.com",Arrays.asList("957890987","987698765")),
						 new Customer(103,"sarfaraz","sarfaraz@gmail.com",Arrays.asList("957890987","987698765")),
						 new Customer(104,"anusha","anusha@gmail.com",Arrays.asList("957890987","987698765")),
						 new Customer(105,"ashutosh","ashutosh@gmail.com",Arrays.asList("957890987","987698765")),
					     new Customer(106,"asar","asar@gmail.com",Arrays.asList("957890987","987698765")),
					     new Customer(107,"deepthi","deepthi@gmail.com",Arrays.asList("957890987","987698765")),
						 new Customer(108,"aman","aman@gmail.com",Arrays.asList("957890987","987698765"))).collect(Collectors.toList());																		

	}

}
