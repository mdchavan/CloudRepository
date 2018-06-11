package com.techlabs.rto;

import java.util.TreeSet;

public class Search {
	TreeSet<RTO> treeSet;

	public Search(TreeSet<RTO> treeSet) {
		this.treeSet = treeSet;
	}

	public RTO searchNode(String statename) {

		for (RTO rto : treeSet) {
			if (rto.getState().equals(statename))
				return rto;
		}
		return null;

	}

}
