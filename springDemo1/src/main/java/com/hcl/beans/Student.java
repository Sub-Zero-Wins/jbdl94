package com.hcl.beans;

import java.util.List;

public class Student 
{
	private int sid;
	private String sname;
	private Address addr;
	private List contacts;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", addr=" + addr + ", contacts=" + contacts + "]";
	}
	public Student(int sid, String sname, Address addr, List contacts) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.addr = addr;
		this.contacts = contacts;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}

	
	public int getSid() {
		
		return sid;
	}
	public void setSid(int sid) {
		System.out.println("setter executed");
		this.sid = sid;
	}
	public String getSname() {
		
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
		System.out.println("setter executed");
	}

	
	public List getContacts() {
		return contacts;
	}
	public void setContacts(List contacts) {
		this.contacts = contacts;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
