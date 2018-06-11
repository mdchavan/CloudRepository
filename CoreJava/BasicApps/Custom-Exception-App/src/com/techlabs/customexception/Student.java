package com.techlabs.customexception;

public class Student {
	public static void validate(int rollno) throws InvalidStudentException {
		if (rollno < 0 || rollno > 100)
			throw new InvalidStudentException("Wrong student roll no");
		else
			System.out.println("It is valid student");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(102);
		} catch (Exception e) {
			System.out.println("Exception occurred : " + e);
		}

	}

}
