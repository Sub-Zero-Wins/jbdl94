package day3;

import java.sql.SQLException;

public class ExpPropogationDemo3 
{
	public static void main(String[] args) throws SQLException
	{
		System.out.println("main start");
		m1();
		System.out.println("main end");

	}

	private static void m1() throws SQLException {

		System.out.println("m1 start");
		m2();
		System.out.println("m1 end");

	}

	private static void m2() throws SQLException {
		System.out.println("m2 start");
		throw new SQLException();
		
	}


}
