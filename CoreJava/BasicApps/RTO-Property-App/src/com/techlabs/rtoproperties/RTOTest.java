package com.techlabs.rtoproperties;

import java.io.IOException;
import java.util.TreeSet;

public class RTOTest {

	public static void main(String[] args) throws IOException {

		Database databaseObj = new Database();
		TreeSet<RTO> treeSet;

		databaseObj.store();

		treeSet = databaseObj.retrive();

		Display dis = new Display();
		System.out.println("List of state " + "\n");
		dis.display(treeSet);

		Search search = new Search(treeSet);
		String code = "Maharashtra";
		RTO rto = search.searchNode(code);
		if (rto != null)
			System.out.println("\n" + "Record found : state " + rto.getState() + " code : " + rto.getCode());
		else
			System.out.println("\n" + "Record not found");

	}

}
