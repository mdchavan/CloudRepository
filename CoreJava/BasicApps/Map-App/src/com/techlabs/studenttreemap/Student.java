package com.techlabs.studenttreemap;

import java.util.Map;
import java.util.TreeMap;

public class Student {
	private int id;
	private String name;
	private int age;
	Map<Integer, Student> treeMap;

	public Student() {
		treeMap = new TreeMap<Integer, Student>();

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
		treeMap.put(key, student);
		return treeMap;

	}

	public void delete(Integer no) {
		treeMap.remove(no);
	}

	public boolean search(String name) {
		for (Map.Entry<Integer, Student> entry : treeMap.entrySet()) {
			Student stud = entry.getValue();
			if (stud.getName().equals(name))
				return true;
		}
		return false;
	}

	public boolean update(Integer key, Student student) {
		if (treeMap.containsKey(key)) {
			treeMap.put(key, student);
			return true;
		} else
			return false;

	}

}
