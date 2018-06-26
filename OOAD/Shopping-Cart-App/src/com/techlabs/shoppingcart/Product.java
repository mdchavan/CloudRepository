package com.techlabs.shoppingcart;

public class Product {
	private int pid;
	private String name;
	private double cost;
	private float discount;
	
	
	public Product(int pid,String name,double cost,float discount){
		this.pid=pid;
		this.name=name;
		this.cost=cost;
		this.discount=discount;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public int getPid() {
		return pid;
	}
	public String getName() {
		return name;
	}
	public double getCost() {
		return cost;
	}
	public float getDiscount() {
		return discount;
	}
	
	public double calculateCostAfterDiscount(){
		double price;
		price=cost;
		return (price-((cost*discount)/100));
	}
	

}
