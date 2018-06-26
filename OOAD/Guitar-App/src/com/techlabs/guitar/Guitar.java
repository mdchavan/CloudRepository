package com.techlabs.guitar;

public class Guitar {
	private String serilNumber;
	private double price;
	private int numberString;
	private GuitarSpec spec;
	
	public int getNumberString() {
		return numberString;
	}
	
	public void setSpec(GuitarSpec spec) {
		this.spec = spec;
	}
	public GuitarSpec getSpec() {
		return spec;
	}
	public String getSerilNumber() {
		return serilNumber;
	}

	public double getPrice() {
		return price;
	}
	public Guitar(String serilNumber,double price,GuitarSpec spec){
		this.serilNumber=serilNumber;
		this.price=price;
		this.spec=spec;
	}
}


