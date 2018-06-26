package com.srp.refactor;
public class InvoiceDisplay {
	private Invoice invoice;
	public InvoiceDisplay(Invoice invoice2){
		this.invoice=invoice2;	
	}
	
	public void display(){
		System.out.println("Id : "+invoice.getId()+"\nName : "+invoice.getName()+"\nCost : "+invoice.getCost());
		System.out.println("Discount : "+invoice.getDiscount());
		System.out.println("Total cost : "+invoice.calculateTotalCost());
		
	}

}
