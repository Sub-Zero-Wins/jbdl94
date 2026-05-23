package com.hcl.annotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcl.autowiring.Address;

@Component
public class Customer 
{
	@Autowired
	Address addr;
	
	
	public Customer(Address addr) {
		super();
		this.addr = addr;
	}
	
	

	public Address getAddr() {
		return addr;
	}


	
	public void setAddr(Address addr) {
		this.addr = addr;
	}



	public void welcomeCust()
	{
		System.out.println("welcome customer");
	}

}
