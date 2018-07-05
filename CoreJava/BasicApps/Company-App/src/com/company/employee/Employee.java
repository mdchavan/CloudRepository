package com.company.employee;

public class Employee implements Comparable<Employee> {
	private int employeeId;
	private String employeename;
	private String employeeDesignation;
	private int managerId;
	private String dateOfJoining;
	private double salary;
	private String commosion;
	private int deparmentNumber;

	public Employee() {

	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCommosion() {
		return commosion;
	}

	public void setCommosion(String commosion) {
		this.commosion = commosion;
	}

	public int getDeparmentNumber() {
		return deparmentNumber;
	}

	public void setDeparmentNumber(int deparmentNumber) {
		this.deparmentNumber = deparmentNumber;
	}

	@Override
	public int compareTo(Employee employee) {
		if (salary == employee.salary)
			return 0;
		else if (salary > employee.salary)
			return 1;
		else
			return -1;
	}

}
