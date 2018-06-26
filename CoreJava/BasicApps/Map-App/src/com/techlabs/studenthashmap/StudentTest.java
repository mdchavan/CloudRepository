package com.techlabs.studenthashmap;

import java.util.Map;

public class StudentTest {

	public static void main(String[] args) {
		Map<Integer, Student> hashMap;

		Student student = new Student();
		Student student1 = new Student(101, "Mahesh", 20);
		Student student2 = new Student(105, "Ram", 22);
		Student student3 = new Student(102, "Gopal", 24);
		Student student4 = new Student(104, "Kumar", 23);
		Student student5 = new Student(103, "Charan", 26);

		hashMap = student.add(1, student1);
		hashMap = student.add(2, student2);
		hashMap = student.add(3, student3);
		hashMap = student.add(4, student4);
		hashMap = student.add(5, student5);

		System.out.println("Student added record in hash map .");
		for (Map.Entry<Integer, Student> entry : hashMap.entrySet()) {
			int key = entry.getKey();
			Student stud = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println("    " + stud.getId() + "  " + stud.getName() + "  " + stud.getAge());
		}

		student.delete(1);
		System.out.println("Record deleted from hashmap : " + 101);
		System.out.println("Record after deleted ");
		for (Map.Entry<Integer, Student> entry : hashMap.entrySet()) {
			int key = entry.getKey();
			Student stud = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println("    " + stud.getId() + "  " + stud.getName() + "  " + stud.getAge());
		}
		boolean check = student.search("Gopal");
		if (check)
			System.out.println("\n" + "Record found" + " Gopal ");
		else
			System.out.println("\n" + "Record not found ");

		Student student6 = new Student(106, "Rahul", 30);
		boolean check1 = student.update(3, student6);
		if (check1) {
			System.out.println("Recod updated successfully of key : " + 3);
			for (Map.Entry<Integer, Student> entry : hashMap.entrySet()) {
				int key = entry.getKey();
				Student stud = entry.getValue();
				System.out.println(key + " Details:");
				System.out.println("    " + stud.getId() + "  " + stud.getName() + "  " + stud.getAge());
			}
		} else
			System.out.println("Record not updated ,key is invalid");

	}

}
