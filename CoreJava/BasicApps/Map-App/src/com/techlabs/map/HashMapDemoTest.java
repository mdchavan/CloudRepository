package com.techlabs.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemoTest {

	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		HashMapDemo hashdemo = new HashMapDemo();
		hashdemo.add(103, "Ram");
		hashdemo.add(101, "Mahesh");
		hashdemo.add(102, "Sunil");
		hashdemo.add(105, "Ajit");
		hashdemo.add(104, "Pravin");

		System.out.println("Values added in hashmap");

		hashmap = hashdemo.display();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry record = (Map.Entry) iterator.next();
			System.out.println(record.getKey() + "  " + record.getValue());
		}

		hashdemo.delete(101);
		System.out.println("Record deleted from hashmap " + 101);
		System.out.println("Record after deleted ");
		Iterator iterator1 = hashmap.entrySet().iterator();

		while (iterator1.hasNext()) {
			Map.Entry record = (Map.Entry) iterator1.next();
			System.out.println(record.getKey() + "  " + record.getValue());
		}
		boolean check = hashdemo.search("Ajit");
		if (check)
			System.out.println("\n" + "Record found" + " Ajit ");
		else
			System.out.println("\n" + "Record not found ");

		boolean check1 = hashdemo.update(103, "Vikram");
		if (check1) {
			System.out.println("Recod updated successfully of key : " + 3);
			Iterator iterator2 = hashmap.entrySet().iterator();

			while (iterator2.hasNext()) {
				Map.Entry record = (Map.Entry) iterator2.next();
				System.out.println(record.getKey() + "  " + record.getValue());
			}
		} else

			System.out.println("Record not updated ,key is invalid");

	}

}
