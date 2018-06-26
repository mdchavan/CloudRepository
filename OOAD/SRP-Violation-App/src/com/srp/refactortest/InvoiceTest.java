package com.srp.refactortest;

import com.srp.refactor.InvoiceDisplay;
import com.srp.refactor.*;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice=new Invoice(101,"Pen",100,10);
		InvoiceDisplay invoiceDisplay=new InvoiceDisplay(invoice);
		invoiceDisplay.display();


	}

}
