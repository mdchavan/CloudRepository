package com.techlabs.shoppingcart;

import java.util.List;

public class Customer {
	private String name;
	private List<Order> order;
	
	
	public Customer(String name , List<Order> order){
		this.name=name;
		this.order=order;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOrder(List<Order> order) {
		this.order = order;
	}
	public List<Order> getOrder(){
		return order;
	}
	public void addOrder(LineItem lineItem,List<LineItem> orderItem){
		orderItem.add(lineItem);
	}




	
	
	
	
	
	
}
