package com.techlab.filereadwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fwriter = new FileWriter("sample.txt", true);
		fwriter.write("Welcome to swabhav techlab");
		fwriter.write("\n");
		fwriter.write("Java programming");
		fwriter.close();
		try {
			FileReader filerreader = new FileReader("sample.txt");
			int character;
			while ((character = filerreader.read()) != -1) {
				System.out.print((char) character);

			}
			filerreader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
