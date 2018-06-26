package com.techlabs.shoppingcarttest;

import com.techlabs.shoppingcart.LineItem;
import com.techlabs.shoppingcart.Product;

public class LineItemTest {

	public static void main(String[] args) {
		LineItem lt=new LineItem(101,10,new Product(11,"Pen",100,10));
		Product p=lt.getProduct();
		System.out.println("Line Item id: "+lt.getLid()+"  Line item quantity : "+lt.getQty()+"\n Product id : "+p.getPid()
		+" Product name : "+p.getName()+" Product cost : "+p.getCost()+" Product discount : "+p.getDiscount());
		System.out.println(" Product cost after discount : "+p.calculateCostAfterDiscount());
		System.out.println(" Total line cost : "+lt.totalLineCost());

	}

}
