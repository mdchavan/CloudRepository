package com.techlabs.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	Map<Integer, String> hashmap = new HashMap<Integer, String>();

	public void add(Integer key, String value) {
		hashmap.put(key, value);

	}

	public Map<Integer, String> display() {
		return hashmap;
	}

	public void delete(Integer no) {
		hashmap.remove(no);
	}

	public boolean search(String name) {
		return hashmap.containsValue(name);
	}

	public boolean update(Integer key, String name) {
		if (hashmap.containsKey(key)) {
			hashmap.put(key, name);
			return true;
		} else
			return false;

	}

}
