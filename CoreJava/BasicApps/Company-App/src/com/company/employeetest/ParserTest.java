package com.company.employeetest;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.company.employee.DiskLoader;
import com.company.employee.Employee;
import com.company.employee.ILoader;
import com.company.employee.Parser;

public class ParserTest {

	public static void main(String[] args) throws Exception {

		List<String> list = new LinkedList<String>();
		Set<Employee> employeeData;
		// List<Employee> employeeList;
		Set<Employee> employeeList;
		Set<String> parseData;

		ILoader loadFile = new DiskLoader();

		Parser parse = new Parser();

		list = loadFile.load();

		System.out.println("load from disk");
		for (String lists : list) {
			System.out.println(lists);
		}

		employeeList = parse.parseData(list);
		System.out.println("EmployeeId " + "\tEmployeeName" + "\tEmployeeDesignation" + "\tManagerId"
				+ "\tDateOfJoining" + "\tSalary" + "\tCommission" + "\tDepartmentNumber");

		for (Employee employee : employeeList) {
			System.out.println(employee.getEmployeeId() + "\t\t" + employee.getEmployeename() + "\t\t	"
					+ employee.getEmployeeDesignation() + "\t" + employee.getManagerId() + "\t\t"
					+ employee.getDateOfJoining() + "\t" + employee.getSalary() + "\t\t" + employee.getCommosion()
					+ "\t\t" + employee.getDeparmentNumber());

		}
	}

}
