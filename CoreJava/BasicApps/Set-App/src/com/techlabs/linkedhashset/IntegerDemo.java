package com.techlabs.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class IntegerDemo {
	Set<Integer> hash = new LinkedHashSet<Integer>();

	public void add(Integer no) {
		hash.add(no);

	}

	public Set<Integer> display() {
		return hash;
	}

	public void delete(Integer number) {
		hash.remove(number);
	}

	public boolean search(Integer no) {
		return hash.contains(no);
	}

}
