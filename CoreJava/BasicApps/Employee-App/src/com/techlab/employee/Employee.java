package com.techlab.employee;

public class Employee {
	private String fname;
	private String lname;
	private int empid;
	private float salary;

	public Employee(int empid, String fname, String lname, float salary) {
		this.fname = fname;
		this.lname = lname;
		this.empid = empid;
		this.salary = salary;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFname() {
		return fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLname() {
		return lname;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

}
