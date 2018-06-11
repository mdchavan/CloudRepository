package com.techlabs.stacktrace;

public class TestTraceStack {

	public static void main(String[] args) throws Exception {
		System.out.println("Start main() method  ");
		m1();
		System.out.println("End of main() method ");
	}

	public static void m1() throws Exception {
		System.out.println("Inside m1() method");

		m2();

	}

	public static void m2() throws Exception {
		System.out.println("Insidee m2() method");
		m3();

	}

	public static void m3() throws Exception {
		System.out.println("Inside m3() method");
		throw new Exception("Error");

	}

}
