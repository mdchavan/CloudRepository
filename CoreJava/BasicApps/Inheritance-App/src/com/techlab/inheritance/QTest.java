package com.techlab.inheritance;

public class QTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q1 = new Q(200);
		System.out.println("q1 object");
		System.out.println(q1.getFoo());
		Q q2 = new Q(400);
		System.out.println("q2 object");
		System.out.println(q2.getFoo());
		Q q3 = new Q();
		System.out.println("q3 object");
		System.out.println(q3.getFoo());

	}

}
