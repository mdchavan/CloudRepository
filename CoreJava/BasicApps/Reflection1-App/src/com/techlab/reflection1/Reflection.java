package com.techlab.reflection1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflection {
	public Object obj;

	public Class cls;
	public static int setCount = 0;
	public static int getCount = 0;

	public Reflection(Class cls) {
		this.cls = cls;

	}

	public void displayConstructor() {
		Constructor[] cons = cls.getDeclaredConstructors();
		System.out.println("Class name  : " + cls.getName());
		System.out.println("Constructor display");
		for (Constructor con : cons) {
			System.out.print("  " + con.toString());
		}
	}

	public void displayMethod() {
		String[] getMethod = new String[20];
		String[] setMethod = new String[20];
		int i = -1, j = -1;
		Method[] methods = cls.getDeclaredMethods();
		System.out.println("\n" + "Display methods ");
		for (Method method : methods) {
			if (method.getName().startsWith("get")) {
				getCount++;
				++i;
				getMethod[i] = method.getName();

			} else if (method.getName().startsWith("set")) {
				setCount++;
				++j;
				setMethod[j] = method.getName();
			} else
				System.out.print("  " + method.getName());
		}
		System.out.println("\n" + "No. of setters methods : " + setCount + "\n");
		for (String getMethods : getMethod)
			System.out.print("  " + getMethods);
		System.out.println("\n" + "No. of getters methods : " + getCount + "\n");
		for (String setMethods : setMethod)
			System.out.print("  " + setMethods);
	}

}
