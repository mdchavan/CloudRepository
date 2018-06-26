package com.techlabs.shoppingcarttest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.shoppingcart.Customer;
import com.techlabs.shoppingcart.LineItem;
import com.techlabs.shoppingcart.Order;
import com.techlabs.shoppingcart.Product;

public class CustomerTest {
	static SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {
		List<Order> order=new LinkedList<Order>();
		LineItem lineItem=new LineItem();
		List<LineItem> orderItem=new LinkedList<LineItem>();
		Customer customer=new Customer("Mahesh",order);
		
		Date date;
		Order order1,order2;
		
		
		//customer.addOrder(new LineItem(101,10,new Product(11,"Pen",100,10)), orderItem);
		//customer.addOrder(new LineItem(102,10,new Product(12,"Pencil",200,20)), orderItem);
		
		try{
			date =dateFormat.parse("26/05/2018");
			order1=new Order(date,orderItem);
			order1.addToCart(new LineItem(101,10,new Product(11,"Pen",100,10)));
			order1.addToCart(new LineItem(102,10,new Product(12,"Pencil",200,20)));
			
			System.out.println("Date :"+dateFormat.format(date)+"\n-------------------------------------------");
			display(orderItem,order1);
			
			
			date =dateFormat.parse("27/05/2018");
			order2=new Order(date,orderItem);
			order2.addToCart(new LineItem(103,10,new Product(11,"Pen",100,20)));
			order2.addToCart(new LineItem(104,10,new Product(12,"Pencil",200,40)));
			
			System.out.println("Date :"+dateFormat.format(date)+"\n-----------------------------------------------");
			display(orderItem,order2);
	
			
		
		}	catch(ParseException e){
			e.printStackTrace();
		}
		
	}
	public static void display(List<LineItem> orderItem,Order order){
		for(LineItem lt:orderItem){
			Product p=(Product)lt.getProduct();
			System.out.println("	Product cost after discount : "+p.calculateCostAfterDiscount());
			System.out.println("	Product quantity : "+lt.getQty());
			System.out.println("	Total line cost : "+lt.totalLineCost());
		}
	
		System.out.println("\n"+" 	Total cost is : "+order.checkOutPrice());
		
	}

}
