package com.company.employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class URLLoader implements ILoader {
	List<String> fileData = new ArrayList();

	public URLLoader() {

	}

	@Override
	public List<String> load() throws Exception {

		URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");

		URLConnection urlConnection = url.openConnection();

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

		String line;

		while ((line = bufferedReader.readLine()) != null) {
			fileData.add(line);
		}
		bufferedReader.close();

		return fileData;

	}

}
