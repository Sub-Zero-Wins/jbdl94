package com.example.demo.jdbcCrud;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeRepo
{
	public Employee addEmployee(Employee emp);
	public Employee getEmployee(int empId);
	public Employee updateEmployee(Employee updatedEmp);
	public Employee deleteEmployee(int empId);
	public List<Employee> getAllEmployees();
	
}
