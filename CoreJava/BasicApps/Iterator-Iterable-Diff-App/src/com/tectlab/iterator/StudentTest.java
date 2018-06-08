package com.tectlab.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ram");
		arrayList.add("Mahesh");
		arrayList.add("Sachin");
		arrayList.add("Pavan");
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.print("  " + iterator.next());
		}

	}

}
