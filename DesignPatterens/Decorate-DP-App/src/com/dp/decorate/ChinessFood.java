package com.dp.decorate;

public class ChinessFood extends FoodDecorator {
	public ChinessFood(IFood newFood){
		super(newFood);
	}
	public String prepareFood(){
		return super.prepareFood()+" , With Tripple rice and Manchurian .";
	}
	public double foodPrice(){
		return super.foodPrice()+150.0;
	}

}
