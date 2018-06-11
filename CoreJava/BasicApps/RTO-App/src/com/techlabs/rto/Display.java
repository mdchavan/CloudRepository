package com.techlabs.rto;

import java.util.TreeSet;

public class Display {
	public void display(TreeSet<RTO> treeSet) {
		for (RTO rto : treeSet) {
			System.out.println("State : " + rto.getState() + " Code : " + rto.getCode());

		}
	}

}
