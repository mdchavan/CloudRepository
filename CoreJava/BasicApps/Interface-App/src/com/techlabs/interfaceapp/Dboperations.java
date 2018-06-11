package com.techlabs.interfaceapp;

public class Dboperations {

	public static void main(String[] args) {
		CustomerDb custobj = new CustomerDb();
		InvoiceDb invoiceobj = new InvoiceDb();
		DepartmentDb departobj = new DepartmentDb();
		System.out.println("Customer deatils" + "\n");
		dbopertion(custobj);
		System.out.println("\n" + "Invoice deatils" + "\n");
		dbopertion(invoiceobj);
		System.out.println("\n" + "Department deatils" + "\n");
		dbopertion(departobj);

	}

	private static void dbopertion(Icrudable obj) {
		obj.create();
		obj.read();
		obj.update();
		obj.delete();

	}

}
