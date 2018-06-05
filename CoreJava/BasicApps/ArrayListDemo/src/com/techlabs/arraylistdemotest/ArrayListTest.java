package com.techlabs.arraylistdemotest;

import java.util.ArrayList;
import java.util.Iterator;

import com.techlabs.arraylistdemo.Employee;

public class ArrayListTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "Ram");
		Employee employee2 = new Employee(102, "Mahesh");
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(employee1);
		arrayList.add(employee2);
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee.empid + "  " + employee.empname);
		}
	}

}
