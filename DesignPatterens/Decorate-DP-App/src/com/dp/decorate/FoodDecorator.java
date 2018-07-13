package com.dp.decorate;

public abstract class FoodDecorator implements IFood {
	private IFood newFood;
	public FoodDecorator(IFood newFood){
		this.newFood=newFood;
	}

	@Override
	public String prepareFood() {
		return newFood.prepareFood();
	}

	@Override
	public double foodPrice() {
		return newFood.foodPrice();
	}

}
