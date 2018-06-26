package com.techlabs.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemoTest {

	public static void main(String[] args) {
		Map<Integer, String> treemap = new TreeMap<Integer, String>();
		TreeMapDemo treeMapDemo = new TreeMapDemo();
		treeMapDemo.add(103, "Om");
		treeMapDemo.add(101, "Sham");
		treeMapDemo.add(102, "Sunil");
		treeMapDemo.add(105, "Pradeep");
		treeMapDemo.add(104, "Kumar");
		System.out.println("Values added in TreeMap");

		treemap = treeMapDemo.display();
		Iterator iterator = treemap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry record = (Map.Entry) iterator.next();
			System.out.println(record.getKey() + "  " + record.getValue());
		}
		treeMapDemo.delete(101);
		System.out.println("Record deleted from Treemap " + 101);
		System.out.println("Record after deleted ");
		Iterator iterator1 = treemap.entrySet().iterator();

		while (iterator1.hasNext()) {
			Map.Entry record = (Map.Entry) iterator1.next();
			System.out.println(record.getKey() + "  " + record.getValue());
		}
		boolean check = treeMapDemo.search("Sunil");
		if (check)
			System.out.println("\n" + "Record found" + " Sunil ");
		else
			System.out.println("\n" + "Record not found ");

		boolean check1 = treeMapDemo.update(103, "Sachin");
		if (check1) {
			System.out.println("Recod updated successfully of key : " + 3);
			Iterator iterator2 = treemap.entrySet().iterator();

			while (iterator2.hasNext()) {
				Map.Entry record = (Map.Entry) iterator2.next();
				System.out.println(record.getKey() + "  " + record.getValue());
			}

		} else

			System.out.println("Record not updated ,key is invalid");

	}

}
