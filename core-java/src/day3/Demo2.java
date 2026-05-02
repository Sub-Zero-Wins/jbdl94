package day3;


interface Itr1
{
	double PI = 4.14;
	void add();
}

class X 
{ 
	 public void add()
	 {
		 System.out.println("impl");
	 }
}
class Y extends X implements Itr1
{

	
}

public class Demo2 {

}
