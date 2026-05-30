package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.jdbcCrud.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo repo;

	@Override
	public Employee addEmployee(Employee emp) {
	
		return repo.addEmployee(emp);
	}

	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		return repo.getEmployee(empId);
	}

	@Override
	public Employee updateEmployee(Employee updatedEmp) {
		// TODO Auto-generated method stub
		return repo.updateEmployee(updatedEmp);
	}

	@Override
	public Employee deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return repo.deleteEmployee(empId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.getAllEmployees();
	}

}
