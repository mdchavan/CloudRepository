package com.techlabs.studenthashmap;

import java.util.HashMap;
import java.util.Map;

public class Student {
	private int id;
	private String name;
	private int age;
	Map<Integer, Student> hashMap;

	public Student() {
		hashMap = new HashMap<Integer, Student>();

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

	public Map<Integer, Student> add(Integer key, Student student) {
		hashMap.put(key, student);
		return hashMap;

	}

	public void delete(Integer no) {
		hashMap.remove(no);
	}

	public boolean search(String name) {
		for (Map.Entry<Integer, Student> entry : hashMap.entrySet()) {
			Student stud = entry.getValue();
			if (stud.getName().equals(name))
				return true;
		}
		return false;
	}

	public boolean update(Integer key, Student student) {
		if (hashMap.containsKey(key)) {
			hashMap.put(key, student);
			return true;
		} else
			return false;

	}

}
