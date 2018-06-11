package com.techlabs.boxunbox;

public class BoxUnbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Auto boxing");
		int a = 10;
		Integer b = new Integer(a);
		Integer c = 20;
		System.out.println(" B : " + b + " C : " + c);

		Integer n1 = new Integer(100);
		int n2 = n1;
		System.out.println("Auto unboxing ");
		System.out.println("  n2 : " + n2);

	}

}
