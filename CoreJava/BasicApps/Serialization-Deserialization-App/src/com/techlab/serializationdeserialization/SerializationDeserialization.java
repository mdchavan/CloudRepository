package com.techlab.serializationdeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDeserialization implements Serializable {
	private String fname;
	private String lname;
	private int rollno;

	public SerializationDeserialization(String fname, String lname, int rollno) {
		this.fname = fname;
		this.lname = lname;
		this.rollno = rollno;
	}

	public void serializable() throws IOException {
		FileOutputStream fout = new FileOutputStream("student.txt");
		ObjectOutputStream obout = new ObjectOutputStream(fout);
		obout.writeObject(this);
		obout.flush();
		System.out.println("Serialization successfull");

	}

	public void deserialize() throws Exception {
		FileInputStream fin = new FileInputStream("student.txt");
		ObjectInputStream obin = new ObjectInputStream(fin);
		SerializationDeserialization sd = (SerializationDeserialization) obin.readObject();
		System.out.println("Fname : " + sd.fname + " Lname : " + sd.lname + " Rollno : " + sd.rollno);
		obin.close();

	}

}
