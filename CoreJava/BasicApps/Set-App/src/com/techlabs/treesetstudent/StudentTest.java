package com.techlabs.treesetstudent;

import java.util.Set;
import java.util.TreeSet;

public class StudentTest {
	public static void main(String[] args) {
		Set<Student> hashSet = new TreeSet<Student>();
		Student student = new Student();
		Student student1 = new Student(101, "Ram", 24);
		Student student2 = new Student(103, "Mahesh", 27);
		Student student3 = new Student(104, "Kumar", 29);
		Student student4 = new Student(105, "Rahul", 30);
		Student student5 = new Student(102, "Om", 32);

		hashSet = student.add(student1);
		hashSet = student.add(student2);
		hashSet = student.add(student3);
		hashSet = student.add(student4);
		hashSet = student.add(student5);

		System.out.println("Added student element" + "\n");
		for (Student students : hashSet) {
			System.out.println("  " + students.getId() + "  " + students.getName() + "  " + students.getAge());

		}
		student.delete(student4);
		System.out.println("Deleted student record is  :" + 105);
		System.out.println("Student record after deleted " + "\n");
		for (Student students : hashSet) {
			System.out.println("  " + students.getId() + "  " + students.getName() + "  " + students.getAge());

		}
		boolean check = student.search(student1);
		if (check)
			System.out.println("\n" + "Student object found");
		else
			System.out.println("\n" + "Student Object not found");
	}

}
