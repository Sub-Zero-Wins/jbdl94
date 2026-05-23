package com.hcl.annotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hcl.annotationConfig.CustmConfig;

public class CustMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(CustmConfig.class);
		Customer c1=context.getBean(Customer.class);
		c1.welcomeCust();
	}

}
