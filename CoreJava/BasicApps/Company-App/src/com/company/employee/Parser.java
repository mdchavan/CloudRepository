package com.company.employee;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Parser {
	Set data = new TreeSet();
	Employee emp;
	// List<Employee> employeeList = new ArrayList<Employee>();
	Set<Employee> employeeList = new TreeSet<Employee>();

	public Parser() {

	}

	public Set<Employee> parseData(List<String> listDatas) {

		for (String listData : listDatas) {
			String line[] = listData.split(",");
			emp = new Employee();

			for (int i = 0; i < line.length; i++) {
				switch (i) {
				case 0:
					emp.setEmployeeId(Integer.parseInt(line[0]));
					break;
				case 1:
					emp.setEmployeename(line[1]);
					break;
				case 2:
					emp.setEmployeeDesignation(line[2]);
					break;
				case 3:
					if (line[3].equalsIgnoreCase("null"))
						break;
					else {
						emp.setManagerId(Integer.parseInt(line[3]));
						break;
					}
				case 4:
					emp.setDateOfJoining(line[4]);
					break;
				case 5:
					emp.setSalary(Double.parseDouble(line[5]));
					break;
				case 6:
					emp.setCommosion(line[6]);
					break;
				case 7:
					emp.setDeparmentNumber(Integer.parseInt(line[7]));
					break;
				}

			}
			if (!line[3].equalsIgnoreCase("null"))
				employeeList.add(emp);
		}
		return employeeList;
	}

}
