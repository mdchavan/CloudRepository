package com.techlabs.rtoproperties;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.TreeSet;

public class Database {
	public void store() throws IOException {

		Properties property = new Properties();
		property.setProperty("MH", "Maharashtra");
		property.setProperty("KL", "Keral");
		property.setProperty("UP", "Utarpradesh");
		property.setProperty("AP", "Andhrapradesh");
		property.setProperty("KA", "Karnataka");
		File file = new File("stateproperties.properties");
		FileOutputStream fileOut = new FileOutputStream(file);
		property.store(fileOut, "Favorite Things");
		fileOut.close();

	}

	public TreeSet<RTO> retrive() throws IOException {
		Properties property = new Properties();
		FileReader fr = new FileReader("stateproperties.properties");
		property.load(fr);

		TreeSet<RTO> treeSet = new TreeSet<RTO>();
		treeSet.add(new RTO("MH", property.getProperty("MH")));
		treeSet.add(new RTO("KL", property.getProperty("KL")));
		treeSet.add(new RTO("UP", property.getProperty("UP")));
		treeSet.add(new RTO("AP", property.getProperty("AP")));
		treeSet.add(new RTO("KA", property.getProperty("KA")));
		return treeSet;

	}

}
