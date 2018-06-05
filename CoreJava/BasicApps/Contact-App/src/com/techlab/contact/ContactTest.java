package com.techlab.contact;

public class ContactTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Add contact");
		Contact contact1 = new Contact("Ram", "Patil", "ram@gmail.com");
		Contact contact2 = new Contact("Mahesh", "Pawar", "mahesh@gmail.com");
		Contact contact3 = new Contact("Kishan", "Kadam", "kishan@gmail.com");
		contact1.add(contact1);
		contact2.add(contact2);
		contact3.add(contact3);
		contact1.display();
		contact2.display();
		contact3.display();

	}

}
