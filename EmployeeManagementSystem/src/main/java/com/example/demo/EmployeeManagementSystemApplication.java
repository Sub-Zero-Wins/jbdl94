package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Employee;
import com.example.demo.jdbcCrud.EmpRepoImpl;


@SpringBootApplication
public class EmployeeManagementSystemApplication implements ApplicationRunner {

	@Autowired
	EmpRepoImpl repo;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
		
		
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
   //  System.out.println(repo.getAllEmployees());
	//	System.out.println(repo.updateEmployee(new Employee(102,"Abhishek",21,20000000)));
	//	System.out.println(repo.deleteEmployee(102));
     //  System.out.println(repo.getEmployee(102));
	//	System.out.println(repo.addEmployee(new Employee(102,"Abhishek",21,1000000)));
       
		
	}

}
