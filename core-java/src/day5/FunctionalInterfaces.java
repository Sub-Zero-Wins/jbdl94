package day5;


@FunctionalInterface // SAM
interface Demo1
{
	void m1();
	
	default void m2() // defender method/virtual extension methd  java 8
	{
		System.out.println("default implementions");
		m3();
	}
	
	private void m3()
	{
		
	}
	
	static void m4()
	{
		
	}
	
}

class Test1  implements Demo1
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	public  void m2() // defender method/virtual extension methd
	{
		System.out.println("default implementions overridens");
	}
	
	
	
}

class Test2 implements Demo1
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}

public class FunctionalInterfaces  implements Demo1
{
	public static void main(String[] args) 
	{
		Test2 test = new Test2();
		
		test.m2();
		
		Demo1.m4();
//		FunctionalInterfaces.m4()
//		new FunctionalInterfaces().m4();
//		m4();
		
		
		
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
