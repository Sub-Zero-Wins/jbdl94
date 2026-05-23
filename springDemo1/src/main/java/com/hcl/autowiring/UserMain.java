package com.hcl.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hcl.annotationBased.Customer;
import com.hcl.annotationConfig.CustmConfig;

public class UserMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(UserConfig.class);
		User u1=context.getBean(User.class);
		System.out.println(u1);
	}
}
