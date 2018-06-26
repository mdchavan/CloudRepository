package com.techlabs.sethash;

import java.util.Set;

public class IntegerDemoTest {
	static Set<Integer> hash;

	public static void main(String[] args) {
		IntegerDemo hash1 = new IntegerDemo();

		hash1.add(10);
		hash1.add(30);
		hash1.add(20);
		hash1.add(60);
		hash1.add(40);
		System.out.println("Integer added set of  values");

		hash = hash1.display();
		System.out.print("Integer values : " + "\n");
		for (Integer set : hash) {
			System.out.print("  " + set);

		}

		hash1.delete(10);
		System.out.println("\n" + "Integer Object removed" + "\n" + "Integer set of values after removed");

		for (Integer set : hash) {
			System.out.print("  " + set);

		}

		boolean check = hash1.search(60);
		if (check)
			System.out.println("\n" + "Integer object found");
		else
			System.out.println("\n" + "Integer Object not found");

	}

}
