package com.techlabs.treeset;

import java.util.Set;
import java.util.TreeSet;

public class IntegerDemo {
	Set<Integer> tree = new TreeSet<Integer>();

	public void add(Integer no) {
		tree.add(no);

	}

	public Set<Integer> display() {
		return tree;
	}

	public void delete(Integer no) {
		tree.remove(no);
	}

	public boolean search(Integer no) {
		return tree.contains(no);
	}

}
