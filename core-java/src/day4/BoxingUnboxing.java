package day4;

public class BoxingUnboxing 
{
	public static void main(String[] args)
	{
		int x = 10;
			
		Integer x1 = x; // implicit boxing / automatic
		
		Integer x2=Integer.valueOf(x);// explicit boxing / manual
		
	    int y=x2; // implicit unboxing
	    
	    int z  =   x2.intValue();//explicit unboxing
		
	}

}
