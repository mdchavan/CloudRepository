package com.techlabs.interfaceapp;

public class DepartmentDb implements Icrudable {
	@Override
	public void create() {
		System.out.println("Department created");

	}

	@Override
	public void read() {
		System.out.println("Department read");

	}

	@Override
	public void update() {
		System.out.println("Department updated");

	}

	@Override
	public void delete() {
		System.out.println("Department deleted");

	}

}
