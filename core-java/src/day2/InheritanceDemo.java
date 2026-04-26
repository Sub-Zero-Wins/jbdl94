package day2;

class A
{
	int x= 10;
	static int y =20;
}
class B extends A
{
	
}
public class InheritanceDemo
{
	public static void main(String[] args) {
		System.out.println(A.y);
		System.out.println(B.y);
		System.out.println(new A().x);
		System.out.println(new B().x);
	}

}
