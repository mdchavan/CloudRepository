package com.techlabs.hashsetstudent;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private int age;
	Set<Student> hashSet = new HashSet<Student>();

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

}
