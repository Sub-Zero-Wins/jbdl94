package com.hcl.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/hcl/beans/config.xml");
		//Student stud1=context.getBean("stud1",Student.class);
		//Student stud1=(Student)context.getBean("stud1");
		//System.out.println(stud1);		
		
		Student stud2=context.getBean("stud2",Student.class);
		System.out.println(stud2);
	}

}
