package com.techlab.contact;

public class ContactTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Add contact");
		Contact contact[] = new Contact[3];
		contact[0] = new Contact("Ram", "Patil", "ram@gmail.com");
		contact[1] = new Contact("Mahesh", "Pawar", "mahesh@gmail.com");
		contact[2] = new Contact("Kishan", "Kadam", "kishan@gmail.com");
		System.out.println("Contact added");
		for (int i = 0; i < 3; i++) {
			contact[i].add();
		}
		for (int i = 0; i < 3; i++) {
			contact[i].display();
		}

	}

}
