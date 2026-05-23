package com.hcl.javaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hcl.beans.Address;

@Configuration
public class BeanConfig
{

	@Bean("addr1")
	public Address getAddress()
	{
		return new Address(56111,"mg road","bangalore");
	}
	
	@Bean("emp1")
	public Employee getEmployee()
	{

		return new Employee(getAddress());
		
	}

}
