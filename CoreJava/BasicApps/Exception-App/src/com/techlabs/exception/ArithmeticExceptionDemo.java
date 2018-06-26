package com.techlabs.exception;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		exceptionDemo();

		// NumberFormatException
		try {
			String name = "Ram";
			int no = Integer.parseInt(name);
			System.out.println(no);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void exceptionDemo() {
		int a, b, c;
		a = 10;
		b = 0;
		// divide by 0 ArithmeticException
		c = a / b;

		System.out.println(c);

		// ArrayIndexOutOfBoundException

		int num[] = { 1, 2, 3, 4 };
		for (int i = 0; i <= 4; i++)
			System.out.println(" " + num[i]);
	}

}
