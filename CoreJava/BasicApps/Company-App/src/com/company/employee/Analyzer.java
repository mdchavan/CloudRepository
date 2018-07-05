package com.company.employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Analyzer {

	public static void main(String[] args) throws Exception {
		List<String> list = new LinkedList<String>();
		Set<Employee> employeeList;

		ILoader loadFile = new DiskLoader();

		Parser parse = new Parser();

		list = loadFile.load();

		employeeList = parse.parseData(list);
		System.out.println(employeeList.size());
		System.out.println("EmployeeId " + "\tEmployeeName" + "\tEmployeeDesignation" + "\tManagerId"
				+ "\tDateOfJoining" + "\tSalary" + "\tCommission" + "\tDepartmentNumber");

		for (Employee employee : employeeList) {
			System.out.println(employee.getEmployeeId() + "\t\t" + employee.getEmployeename() + "\t\t	"
					+ employee.getEmployeeDesignation() + "\t" + employee.getManagerId() + "\t\t"
					+ employee.getDateOfJoining() + "\t" + employee.getSalary() + "\t\t" + employee.getCommosion()
					+ "\t\t" + employee.getDeparmentNumber());
		}

		System.out.println("Display");
		findTotalEmployee(employeeList);
	}

	public static void findTotalEmployee(Set<Employee> employeeList) {
		int dno;
		Set<Integer> hash = new TreeSet<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Iterator it = employeeList.iterator();
		while (it.hasNext()) {
			Employee emp = (Employee) it.next();
			dno = emp.getDeparmentNumber();
			hash.add(dno);

		}

		System.out.println(hash);
		for (int no : hash) {
			int cnt = 0;
			for (Employee emp : employeeList) {
				if (no == emp.getDeparmentNumber())
					cnt++;
			}
			map.put(no, cnt);
		}

		System.out.println("Department wise number of employees");
		Iterator iterator1 = map.entrySet().iterator();
		while (iterator1.hasNext()) {
			Map.Entry record = (Map.Entry) iterator1.next();
			System.out.println(
					"Department number : " + record.getKey() + "  number of employees :   " + record.getValue());
		}

	}

}
