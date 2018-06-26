package com.srp.refactor;

public class Invoice {
	private int id;
	private String name;
	private double cost;
	private double discount;
	private final int GST=12;
	
	public Invoice(int id , String name , double cost , double discount ){
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.discount=discount;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getGst() {
		return GST;
	}
	
	public double calculateTax(){
		return ((cost*GST)/100);
	}
	public double calculateDiscount(){
		return((cost*discount)/100);
	}
	public double calculateTotalCost(){
		return(cost-calculateDiscount()+calculateTax());
	}
	
}
