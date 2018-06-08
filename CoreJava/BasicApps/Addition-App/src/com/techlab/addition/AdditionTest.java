package com.techlab.addition;

public class AdditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = new Addition();
		System.out.println("Int addition : " + add.addition(10, 20));
		System.out.println("Float addition : " + add.addition(20.2f, 30.4f));
		System.out.println("Double addition : " + add.addition(30.4, 40.2));
		System.out.println("String addition : " + add.addition("Ram", "Mahesh"));

	}

}
