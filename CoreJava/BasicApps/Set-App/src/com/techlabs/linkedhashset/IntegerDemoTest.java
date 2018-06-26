package com.techlabs.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class IntegerDemoTest {

	public static void main(String[] args) {
		Set<Integer> lhset = new LinkedHashSet<Integer>();
		IntegerDemo lhash = new IntegerDemo();
		lhash.add(10);
		lhash.add(30);
		lhash.add(20);
		lhash.add(60);
		lhash.add(40);
		System.out.println("Integer all added object");

		lhset = lhash.display();
		System.out.print("Integer values Record : " + "\n");
		for (Integer set : lhset) {
			System.out.print("  " + set);

		}
		lhash.delete(10);
		System.out.println("\n" + "Integer object removed : " + 10 + "\n" + "Integer values set after removed");

		for (Integer set : lhset) {
			System.out.print("  " + set);

		}

		boolean check = lhash.search(60);
		if (check)
			System.out.println("\n" + "Integer object found");
		else
			System.out.println("\n" + "Integer Object not found");

	}

}
