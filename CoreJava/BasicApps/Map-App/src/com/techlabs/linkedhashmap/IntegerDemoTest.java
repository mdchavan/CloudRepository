package com.techlabs.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerDemoTest {
	public static void main(String[] args) {
		Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
		IntegerDemo hashdemo = new IntegerDemo();
		hashdemo.add(101, "Ram");
		hashdemo.add(103, "Mahesh");
		hashdemo.add(105, "Sunil");
		hashdemo.add(102, "Ajit");
		hashdemo.add(104, "Pravin");
		System.out.println("Values added in linkedhashmap");

		linkedhashmap = hashdemo.display();
		Iterator iterator = linkedhashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry record = (Map.Entry) iterator.next();
			System.out.println(record.getKey() + "  " + record.getValue());
		}
		hashdemo.delete(104);
		System.out.println("Record deleted from hashmap " + 101);
		System.out.println("Record after deleted ");
		Iterator iterator1 = linkedhashmap.entrySet().iterator();

		while (iterator1.hasNext()) {
			Map.Entry record = (Map.Entry) iterator1.next();
			System.out.println(record.getKey() + "  " + record.getValue());
		}
		boolean check = hashdemo.search("Ajit");
		if (check)
			System.out.println("\n" + "Record found" + " Ajit ");
		else
			System.out.println("\n" + "Record not found ");

		boolean check1 = hashdemo.update(103, "Sehvag");
		if (check1) {
			System.out.println("Recod updated successfully of key : " + 3);
			Iterator iterator2 = linkedhashmap.entrySet().iterator();

			while (iterator2.hasNext()) {
				Map.Entry record = (Map.Entry) iterator2.next();
				System.out.println(record.getKey() + "  " + record.getValue());
			}
		} else

			System.out.println("Record not updated ,key is invalid");

	}

}
