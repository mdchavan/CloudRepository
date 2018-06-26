package com.techlabs.college;

import java.util.List;

public class CollegeTest {

	public static void main(String[] args) {
		List<Student> studentList; // = new ArrayList<Student>();
		List<Professor> professorList; // = new ArrayList<Professor>();

		Student student1 = new Student(101, "Mumbai", "10 Jun 1999");
		Student student2 = new Student(102, "Dadar", "20 Jully 2000");
		Student student3 = new Student(103, "Andheri", "24 March 1998");
		Student student4 = new Student(104, "Nerul", "26 May 1996");

		Professor professor1 = new Professor(101, "Navi Mumbai", "12 May 1982", 120);
		Professor professor2 = new Professor(102, "Vashi", "12 May 1980", 122);
		Professor professor3 = new Professor(103, "Kalayan", "23 Feb 1984", 124);
		Professor professor4 = new Professor(104, "Ambarnath", "12 May 1981", 126);

		College college = new College();
		college.addStudent(student1);
		college.addStudent(student2);
		college.addStudent(student3);
		college.addStudent(student4);
		System.out.println("Student added" + "\n");

		college.addProfessor(professor1);
		college.addProfessor(professor2);
		college.addProfessor(professor3);
		college.addProfessor(professor4);

		System.out.println("Professor added");

		System.out.println("\n" + " Display All Student" + "\n");

		studentList = college.displayAllStudent();
		for (Student student : studentList) {

			System.out.println(" " + student.getId() + " " + student.getAddress() + " " + student.getDob() + " "
					+ student.getBranch());
		}

		college.calculateSalary();

		System.out.println("\n" + "Display All Professor" + "\n");
		professorList = college.displayAllProfessor();
		for (Professor professor : professorList) {
			System.out.println(professor.getId() + "  " + professor.getAddress() + "  " + professor.getDob() + "  "
					+ professor.getSalary());
		}

	}

}
