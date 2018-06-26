package com.techlabs.shoppingcarttest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.shoppingcart.LineItem;
import com.techlabs.shoppingcart.Order;
import com.techlabs.shoppingcart.Product;

public class OrderHistory {

	public static void main(String[] args) {
		List<LineItem> orderItem=new LinkedList<LineItem>();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		Order order;
		
		LineItem lineItem1=new LineItem(101,10,new Product(11,"Pen",100,10));
		LineItem lineItem2=new LineItem(102,10,new Product(12,"Pencil",200,20));
	
		try{
			date =dateFormat.parse("26/05/2018");
			order=new Order(date,orderItem);
			order.addToCart(lineItem1);
			order.addToCart(lineItem2);
			for(LineItem lt:orderItem){
				Product p=(Product)lt.getProduct();
				System.out.println("Line Item id: "+lt.getLid()+" Line item quantity : "+lt.getQty()+
						"\n"+" Product id : "+p.getPid()
				+" Product name : "+p.getName()+" Product cost : "+p.getCost()+" Product discount : "+p.getDiscount());
				System.out.println("Product cost after discount : "+p.calculateCostAfterDiscount());
				System.out.println("Total line cost : "+lt.totalLineCost());
			}
			
			
			
			System.out.println("date :"+dateFormat.format(date)+" total cost is : "+order.checkOutPrice());
			
		}catch(ParseException e){
			e.printStackTrace();
		}


	}

}
