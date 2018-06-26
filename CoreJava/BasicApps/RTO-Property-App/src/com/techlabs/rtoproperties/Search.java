package com.techlabs.rtoproperties;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Search {
	TreeSet<RTO> treeSet;

	public Search(TreeSet<RTO> treeSet) {
		this.treeSet = treeSet;
	}

	public RTO searchNode(String code) {
		// Set<String> subset = treeSet.subSet(statename, statename +
		// Character.MAX_VALUE);
		List stateList = new ArrayList();

		for (RTO rto : treeSet) {

			if (rto.getState().equals(code)) {

				return rto;
			}
		}
		System.out.println(stateList);
		return null;

	}

}