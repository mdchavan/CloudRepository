package com.techlab.reflection;

public class Employee {
	private int empid;
	private String fname;
	private String lname;
	private float salary;

	public Employee() {
		// System.out.println("default constructor");
	}

	public Employee(int empid, String fname, String lname, float salary) {

	}

	public void addEmp() {
		System.out.println("Employee added .");
	}

	public void display() {
		System.out.println("Display employee .");
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
