package day2;

class Pen
{
	String name; // non static / instance variables
	String color;
    int price;
	
	void write()
	{
       System.out.println("write");
	}
	
	{
		System.out.println("non static block");
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	Pen(String name,String color,int price)
	{
		System.out.println("constr executed");
		//super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	// Pen()
	//{
	//	super();
	//}
}

public class PenMain 
{	
	public static void main(String[] args)
	{
        Pen p = new Pen("Parker","Black",100);
        
      System.out.println(p.color);
      System.out.println(p.price);
      System.out.println(p.name);
        
      Pen p2 = new Pen("Parker","Blue",100);
        
      System.out.println(p2.color);
      System.out.println(p2.price);
      System.out.println(p2.name);
      
      
      

	}
}
