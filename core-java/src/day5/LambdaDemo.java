package day5;

@FunctionalInterface
interface Calc
{
	int square(int x);
}

public class LambdaDemo {
	public static void main(String[] args) 
	{
       Calc c = x-> x*x;
       
       System.out.println( c.square(100));
       System.out.println( c.square(1000));
       System.out.println( c.square(10));
       System.out.println( c.square(1));
       System.out.println( c.square(0));

       math(c);
      
       
       
	}	
	public static void math(Calc c)
	{
	 c.square(0);
	}
	
}
