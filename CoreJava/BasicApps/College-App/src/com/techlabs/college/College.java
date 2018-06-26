package com.techlabs.college;

import java.util.ArrayList;
import java.util.List;

public class College implements SalariedEmployee {
	List<Student> studentList;
	List<Professor> professorList;

	public College() {
		this.studentList = new ArrayList<Student>();
		this.professorList = new ArrayList<Professor>();
	}

	public void addStudent(Student student) {
		studentList.add(student);
	}

	public void addProfessor(Professor professor) {
		professorList.add(professor);
	}

	public List displayAllStudent() {

		return studentList;
	}

	public List displayAllProfessor() {
		return professorList;

	}

	@Override
	public void calculateSalary() {
		for (Professor p : professorList) {
			p.salary = 500 * p.getNoOfHorsWorked();
		}

	}

}
