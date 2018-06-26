package com.techlabs.shoppingcarttest;

import com.techlabs.shoppingcart.Product;

public class ProductTest {

	public static void main(String[] args) {
		Product p=new Product(10,"Pen",100,10);
		System.out.println("Pid : "+p.getPid()+" Product name : "+p.getName()+" Product cost : "+p.getCost()+" Product discount : "+p.getDiscount());
		System.out.println("Product cost after discount : "+p.calculateCostAfterDiscount());
		

	}

}
