package com.dp.decoratetest;

import com.dp.decorate.ChinessFood;
import com.dp.decorate.IFood;
import com.dp.decorate.NonVegFood;
import com.dp.decorate.VegFood;

public class Customer {

	public static void main(String[] args) {
		VegFood vegFood=new VegFood();
		System.out.println(vegFood.prepareFood());
		System.out.println(vegFood.foodPrice());
		
		IFood nonVegFood=new NonVegFood((IFood) vegFood);
		System.out.println(nonVegFood.prepareFood());
		System.out.println(nonVegFood.foodPrice());
		
		IFood chinessFood=new ChinessFood((IFood) vegFood);
		System.out.println(chinessFood.prepareFood());
		System.out.println(chinessFood.foodPrice());	
	}

}
