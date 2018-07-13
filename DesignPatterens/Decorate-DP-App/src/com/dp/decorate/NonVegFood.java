package com.dp.decorate;

public class NonVegFood extends FoodDecorator {
	public NonVegFood(IFood newFood){
		super(newFood);
	}
	public String prepareFood(){
		return super.prepareFood()+" , Chiken curry .";
	}
	public double foodPrice(){
		return super.foodPrice()+100.0;
	}

}
