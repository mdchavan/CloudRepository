package com.techlab.contact;

import java.util.ArrayList;
import java.util.Iterator;

public class Contact {
	private String fname;
	private String lname;
	private String email;
	ArrayList<Contact> al;

	public Contact(String fname, String lname, String email) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void add(Contact con) {
		al = new ArrayList<Contact>();
		al.add(con);
	}

	public void display() {
		// System.out.println(al.size());
		Iterator it = al.iterator();

		while (it.hasNext()) {
			Contact con = (Contact) it.next();
			System.out.println(" First name : " + con.getFname() + " , Last name : " + con.getLname() + "  , email : "
					+ con.getEmail());
		}
	}

}
