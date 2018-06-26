package com.techlabs.treeset;

import java.util.Set;
import java.util.TreeSet;

public class IntegerDemoTest {

	public static void main(String[] args) {
		IntegerDemo hash1 = new IntegerDemo();
		Set<Integer> tree = new TreeSet<Integer>();

		hash1.add(10);
		hash1.add(30);
		hash1.add(20);
		hash1.add(60);
		hash1.add(40);
		System.out.println("Integer added values");

		tree = hash1.display();
		System.out.print("Integer values : " + "\n");
		for (Integer set : tree) {
			System.out.print("  " + set);

		}
		hash1.delete(10);
		System.out.println("\n" + "Integer Object removed" + "\n" + "Integer values after removed");

		for (Integer set : tree) {
			System.out.print("  " + set);

		}

		boolean check = hash1.search(20);
		if (check)
			System.out.println("\n" + "Integer object found");
		else
			System.out.println("\n" + "Integer Object not found");

	}

}
