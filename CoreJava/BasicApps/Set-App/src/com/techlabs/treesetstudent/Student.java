package com.techlabs.treesetstudent;

import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	public int age;
	Set<Student> hashSet = new TreeSet<Student>();

	public Student() {

	}

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Set<Student> add(Student student1) {
		hashSet.add(student1);
		return hashSet;

	}

	public void delete(Student student) {
		hashSet.remove(student);
	}

	public boolean search(Student student) {
		return hashSet.contains(student);
	}

	@Override
	public int compareTo(Student student) {
		if (age == student.age)
			return 0;
		else if (age > student.age)
			return 1;
		else
			return -1;
	}

}
