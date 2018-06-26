package com.techlabs.college;

public class Student extends Person {
	Branch branch;

	public Student(int id, String address, String dob) {
		this.id = id;
		this.address = address;
		this.dob = dob;
		branch = Branch.IT;

	}

	public String getBranch() {
		return branch.toString();
	}

	@Override
	public String toString() {
		return "Student [branch=" + branch + ", id=" + id + ", address=" + address + ", dob=" + dob + ", getBranch()="
				+ getBranch() + ", getId()=" + getId() + ", getAddress()=" + getAddress() + ", getDob()=" + getDob()
				+ ", toString()=" + super.toString() + "]";
	}

}
