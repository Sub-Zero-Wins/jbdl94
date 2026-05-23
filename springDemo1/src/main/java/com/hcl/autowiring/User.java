package com.hcl.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User 
{
	
	@Autowired
	private Address addr;

	public Address getAddr() {
		return addr;
	}


	public void setAddr(Address addr) {
		System.out.println("Setter injection");
		this.addr = addr;
	}

	
	public User(Address addr) {
		
		super();
		System.out.println("constructor injection");
		this.addr = addr;
	}
	public User() {
		
	}

	@Override
	public String toString() {
		return "User [addr=" + addr + "]";
	}
	
	

}
