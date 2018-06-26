package com.techlabs.shoppingcart;

import java.util.*;
import java.text.*;
import java.util.List;

public class Order {
	private Date date;
	private List<LineItem> orderItem;
	
	public Order(Date date,List<LineItem> lineItem){
		this.date=date;
		this.orderItem=lineItem;
	}
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<LineItem> getOrderItem() {
		return orderItem;
	}
	public void setOrderItem(List<LineItem> lineItem) {
		this.orderItem = lineItem;
	}
	
	
	public void remove(LineItem lineItem){
		orderItem.remove(lineItem);		
	}
	public void addToCart(LineItem linetItem){
		
		orderItem.add(linetItem);
	}
	
	public double checkOutPrice(){
		double price=0.0;
		for(LineItem lineItem:orderItem){
			price+=lineItem.totalLineCost();
		}
		return price;
	}
	

}
