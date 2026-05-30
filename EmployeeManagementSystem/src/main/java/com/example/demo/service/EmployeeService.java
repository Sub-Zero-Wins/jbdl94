package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee emp);
	public Employee getEmployee(int empId);
	public Employee updateEmployee(Employee updatedEmp);
	public Employee deleteEmployee(int empId);
	public List<Employee> getAllEmployees();
}
