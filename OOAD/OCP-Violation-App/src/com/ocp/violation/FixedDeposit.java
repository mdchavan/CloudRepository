package com.ocp.violation;

public class FixedDeposit {
	private String name;
	private double principle;
	private int year;
	private FestivelType festivel; 
	
	public FixedDeposit(String name, double principle, int year, FestivelType festivel){
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
	public FestivelType getFestivel() {
		return festivel;
	}
	public void setFestivel(FestivelType festivel) {
		this.festivel = festivel;
	}
	
	public int findRate(){
		switch(this.festivel){
		case HOLY :
			return 8;
		case NEWYEAR :
			return 9;
		default :
			return 7;
		}
		
	}
	public double calculateInterest(){
		return((principle*year*findRate())/100);
	}

}
