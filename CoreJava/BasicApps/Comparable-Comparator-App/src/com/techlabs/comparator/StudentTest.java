package com.techlabs.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(101, "Ram", 24));
		arrayList.add(new Student(102, "Amit", 25));
		arrayList.add(new Student(103, "Sachin", 26));
		arrayList.add(new Student(104, "Pavan", 23));

		System.out.println("Sorting by name" + "\n");

		Collections.sort(arrayList, new NameComparator());
		Iterator itr = arrayList.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by Age" + "\n");

		Collections.sort(arrayList, new AgeComparator());
		Iterator itr1 = arrayList.iterator();
		while (itr1.hasNext()) {
			Student st = (Student) itr1.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
