package com.techlab.serializationdeserialization;

public class SerializationDeserializationTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SerializationDeserialization sd1 = new SerializationDeserialization("Ram", "Kadam", 1001);
		SerializationDeserialization sd2 = new SerializationDeserialization("Mahesh", "Patil", 1002);
		sd1.serializable();
		sd1.deserialize();

	}

}
