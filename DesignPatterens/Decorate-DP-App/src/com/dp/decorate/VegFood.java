package com.dp.decorate;

public class VegFood implements IFood {

	@Override
	public String prepareFood() {
		return "Veg Food";
	}

	@Override
	public double foodPrice() {
		return 50;
	}

}
