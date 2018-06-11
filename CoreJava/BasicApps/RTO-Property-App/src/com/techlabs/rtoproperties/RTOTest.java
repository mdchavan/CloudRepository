package com.techlabs.rtoproperties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.TreeSet;

public class RTOTest {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("stateproperties.properties");

		Properties property = new Properties();
		property.load(fr);

		TreeSet<RTO> treeSet = new TreeSet<RTO>();
		treeSet.add(new RTO("MH", Integer.parseInt(property.getProperty("MH"))));
		treeSet.add(new RTO("KL", Integer.parseInt(property.getProperty("UP"))));
		treeSet.add(new RTO("AP", Integer.parseInt(property.getProperty("KL"))));
		treeSet.add(new RTO("UP", Integer.parseInt(property.getProperty("TL"))));
		treeSet.add(new RTO("GA", Integer.parseInt(property.getProperty("GA"))));

		Display dis = new Display();
		dis.display(treeSet);

		Search search = new Search(treeSet);
		String state = "KL";
		RTO rto = search.searchNode(state);
		if (rto != null)
			System.out.println("\n" + "Record found : state " + rto.getState() + " code : " + rto.getCode());
		else
			System.out.println("\n" + "Record not found");

	}

}
