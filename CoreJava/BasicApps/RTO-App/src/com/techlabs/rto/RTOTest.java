package com.techlabs.rto;

import java.util.TreeSet;

public class RTOTest {

	public static void main(String[] args) {
		TreeSet<RTO> treeSet = new TreeSet<RTO>();
		treeSet.add(new RTO("MH", 01));
		treeSet.add(new RTO("KL", 02));
		treeSet.add(new RTO("AP", 07));
		treeSet.add(new RTO("UP", 10));
		treeSet.add(new RTO("GA", 05));

		Display dis = new Display();
		dis.display(treeSet);

		Search search = new Search(treeSet);
		String state = "AP";
		RTO rto = search.searchNode(state);
		if (rto != null)
			System.out.println("\n" + "Record found : state " + rto.getState() + " code : " + rto.getCode());
		else
			System.out.println("\n" + "Record not found");

	}

}
