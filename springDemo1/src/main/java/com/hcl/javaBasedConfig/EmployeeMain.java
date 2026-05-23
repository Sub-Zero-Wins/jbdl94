package com.hcl.javaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
		Employee emp=context.getBean("emp1",Employee.class);
		emp.welcomeEmployee();
		System.out.println(emp);
		
		
		
	}

}
