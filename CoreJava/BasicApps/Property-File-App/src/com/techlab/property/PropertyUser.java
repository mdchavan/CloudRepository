package com.techlab.property;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("user.properties");

		Properties property = new Properties();
		property.load(fr);
		String username = property.getProperty("user");
		String password = property.getProperty("password");
		System.out.println(" User name : " + username);
		System.out.println(" Password : " + password);

	}

}
