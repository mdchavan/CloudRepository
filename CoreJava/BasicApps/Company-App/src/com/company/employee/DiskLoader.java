package com.company.employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DiskLoader implements ILoader {
	List<String> fileData = new ArrayList();

	public DiskLoader() {

	}

	public List<String> load() throws Exception {
		File file = new File("employee.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null) {
			fileData.add(st);
		}
		br.close();
		return fileData;
	}

}
