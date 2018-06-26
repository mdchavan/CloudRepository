package com.techlabs.sethash;

import java.util.HashSet;
import java.util.Set;

public class IntegerDemo {
	Set<Integer> hash = new HashSet<Integer>();

	public void add(Integer no) {
		hash.add(no);

	}

	public Set<Integer> display() {
		return hash;
	}

	public void delete(Integer no) {
		hash.remove(no);
	}

	public boolean search(Integer no) {
		return hash.contains(no);
	}

}
