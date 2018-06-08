package com.tectlab.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeTest implements Iterable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList = new ArrayList();
		arrayList.add("Amit");
		arrayList.add("Kumar");
		arrayList.add("Pratik");
		arrayList.add("Mahesh");
		for (Object al : arrayList) {
			System.out.print("  " + al);
		}

	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
