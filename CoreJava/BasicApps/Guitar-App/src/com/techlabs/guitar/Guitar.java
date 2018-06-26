package com.techlabs.guitar;

public class Guitar {
	private String serilNumber, model;
	private double price;
	private Builder builder;
	private Type type;
	private Wood backWood, topWood;

	public String getSerilNumber() {
		return serilNumber;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public double getPrice() {
		return price;
	}

	public Guitar(String serilNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		this.serilNumber = serilNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;

	}

}
