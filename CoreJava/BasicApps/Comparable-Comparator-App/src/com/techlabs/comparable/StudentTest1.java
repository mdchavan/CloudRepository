package com.techlabs.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest1 {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(101, "Kumar", 25));
		arrayList.add(new Student(102, "Amol", 26));
		arrayList.add(new Student(103, "Ramesh", 24));
		Collections.sort(arrayList);
		for (Student student : arrayList) {
			System.out.println(student.rollno + "  " + student.name + "  " + student.age);
		}

	}

}
