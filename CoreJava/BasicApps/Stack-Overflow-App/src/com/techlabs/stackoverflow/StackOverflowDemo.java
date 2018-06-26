package com.techlabs.stackoverflow;

public class StackOverflowDemo {

	public static void main(String[] args) {
		reccursiveOver(1);

	}

	public static void reccursiveOver(int n) {
		System.out.println(n);
		if (n == 0)
			return;
		else
			reccursiveOver(++n);

	}

}
