package com.techlab.reflection1;

public class ReflectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Class cl = Class.forName("java.lang.System");
		Reflection refl = new Reflection(System.class);
		refl.displayConstructor();
		refl.displayMethod();

	}

}
