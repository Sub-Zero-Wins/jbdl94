package com.example.demo.entity;

public class Employee 
{
	private int empid;
	private String name;
	private int age;
	private int salary;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public Employee(int empid, String name, int age, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	


}
