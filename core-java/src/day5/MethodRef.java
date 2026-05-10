package day5;

interface Itr
{
	int add(int a,int b);
}

class A
{
	public int sum(int x, int y)
	{
		return x+y;
	}
}


public class MethodRef
{
	public static void main(String[] args)
	{
		A a = new A();
		Itr i = a::sum;
		
		System.out.println(i.add(10,20));
		
		
		

	}
}
