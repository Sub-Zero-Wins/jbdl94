package day2;

//import java.lang.*

class Parent
{
	Parent(int x)
	{
		//super();
		System.out.println("Parent Constr.");
	}
}
class Child extends Parent
{
	Child()
	{
		super(10);
		System.out.println("Child Constr.");
	}
}

public class Demo2 // extends Object
{
	// 11 methods of object class
	
	// default Const
	
	// public Demo2()
	//{
    //   super();
	//}
	public static void main(String[] args) 
	{
		new Child();
		
	}

}
