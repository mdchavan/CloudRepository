package com.ocp.refactor;


public class FixedDeposit {
	private String name;
	private double principle;
	private int year;
	private IFestival festivel; 
	
	public FixedDeposit(String name, double principle, int year, IFestival festivel){
		this.name=name;
		this.principle=principle;
		this.year=year;
		this.festivel=festivel;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public double calculateInterest(){
		return((principle*year*festivel.calculateRate())/100);
	}

}
