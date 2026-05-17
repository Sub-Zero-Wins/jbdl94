package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  
	  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?useSSL=false","root","root");
	  
	  Statement stmt=conn.createStatement();
	  
	  ResultSet rs=stmt.executeQuery("SELECT * FROM employee");
	  
	  while(rs.next())
	  {
          System.out.println(rs.getInt(1) +" "+ rs.getString(2)+ " "+rs.getInt(3));		  
	  }
	  
		
	  
	}

}
