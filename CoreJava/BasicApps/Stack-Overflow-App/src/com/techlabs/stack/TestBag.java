package com.techlabs.stack;

public class TestBag {

	public static void main(String[] args) throws Exception {
		String a = args[0];

		String b = args[1];
		System.out.println(" leng " + args.length);
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int c;
		c = a1 / b1;
		System.out.println(c);
		main(args);

	}

}
