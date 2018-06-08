package com.techlab.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class EmployeeTest {
	public static int getCount = 0;
	public static int setCount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		// System obj= new System();

		Class cls = emp.getClass();

		System.out.println("Class name : " + cls.getName());

		Constructor[] cons = cls.getConstructors();
		System.out.println("Constructor name \n");
		for (Constructor constr : cons) {
			System.out.print("  " + constr.getName());

		}

		Method[] methods = cls.getDeclaredMethods();
		System.out.println();
		System.out.println("Method name \n");
		for (Method method : methods) {
			if (method.getName().startsWith("get"))
				getCount++;
			else if (method.getName().startsWith("set"))
				setCount++;

			System.out.print("  " + method.getName());
		}
		System.out.println("\n" + "no of get methods : " + getCount);
		System.out.println("\n" + "no of set methods : ");

	}

}
