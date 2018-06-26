package com.techlabs.college;

public class Professor extends Person {
	public double salary;
	public int noOfHorsWorked;

	public Professor(int id, String address, String dob, int noOfHorsWorked) {
		this.id = id;
		this.address = address;
		this.dob = dob;
		this.noOfHorsWorked = noOfHorsWorked;
	}

	public double getSalary() {
		return salary;
	}

	public int getNoOfHorsWorked() {
		return noOfHorsWorked;
	}

	@Override
	public String toString() {
		return "Professor [salary=" + salary + ", id=" + id + ", address=" + address + ", dob=" + dob + ", getSalary()="
				+ getSalary() + ", getId()=" + getId() + ", getAddress()=" + getAddress() + ", getDob()=" + getDob()
				+ ", toString()=" + super.toString() + "]";
	}

}
