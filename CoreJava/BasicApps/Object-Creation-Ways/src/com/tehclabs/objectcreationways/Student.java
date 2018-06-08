package com.tehclabs.objectcreationways;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class Student implements Cloneable, Serializable {
	String objname1 = "newkeyObject";

	public Student() {

	}

	public static void main(String[] args) throws Exception, IllegalAccessException {
		Student newkeyObject = new Student();

		System.out.println("Object created by using new key ward : " + newkeyObject.objname1);
		Student newinstanceObject = Student.class.newInstance();
		System.out.println("\n" + "Object created by newInstance() method : " + newinstanceObject.getClass().getName());

		Student newinstObject = (Student) Class.forName("com.tehclabs.objectcreationways.Student").newInstance();
		System.out.println("\n" + "Object created : " + newkeyObject.getClass().getName());

		Constructor<Student> constructorObject = Student.class.getConstructor();
		System.out.println("\n" + "Object created by Constructor : " + constructorObject.getClass().getName());

		Student cloneObject = (Student) newinstanceObject.clone();
		System.out.println("Object created by cloneable : " + cloneObject.getClass().getName());

		FileOutputStream fio = new FileOutputStream("student.ser");
		ObjectOutputStream oobs = new ObjectOutputStream(fio);
		oobs.writeObject(newinstanceObject);
		oobs.close();
		fio.close();

		FileInputStream fis = new FileInputStream("student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student deserilizableObject = (Student) ois.readObject();
		ois.close();
		fis.close();

		System.out.println(
				"\n" + "Object created by using deserialization : " + deserilizableObject.getClass().getName());

	}

}
