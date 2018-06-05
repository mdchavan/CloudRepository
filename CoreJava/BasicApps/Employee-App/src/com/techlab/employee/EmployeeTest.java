package com.techlab.employee;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
	private static final String COMMA_DELIMITER = ",";

	private static final String NEW_LINE_SEPARATOR = "\n";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(101, "Ram", "Kadam", 25000);
		Employee employee2 = new Employee(102, "Mahesh", "Patil", 30000);
		Employee employee3 = new Employee(103, "Charan", "Pawar", 35000);
		Employee employee4 = new Employee(104, "Prabhas", "Chaan", 34000);
		Employee employee5 = new Employee(105, "Pavan", "Mane", 25000);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		System.out.println(employees.size());

		FileWriter fwrite = new FileWriter("employee.csv");
		// System.out.println(employees);
		for (Employee employee : employees) {
			fwrite.append(String.valueOf(employee.getEmpid()));
			fwrite.append(COMMA_DELIMITER);
			fwrite.append(employee.getFname());
			fwrite.append(COMMA_DELIMITER);
			fwrite.append(employee.getLname());
			fwrite.append(COMMA_DELIMITER);
			fwrite.append(String.valueOf(employee.getSalary()));
			fwrite.append(NEW_LINE_SEPARATOR);
			fwrite.append(NEW_LINE_SEPARATOR);
		}
		System.out.println("CSV file is created");
		fwrite.flush();
		fwrite.close();

	}

}
