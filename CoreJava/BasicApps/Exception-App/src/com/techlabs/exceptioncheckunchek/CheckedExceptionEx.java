package com.techlabs.exceptioncheckunchek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionEx {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("D:\\Maruti\\abc.txt");
		BufferedReader fileInput = new BufferedReader(file);
		for (int i = 0; i < 3; i++)
			System.out.println(fileInput.readLine());
		fileInput.close();
		file.close();
	}

}
