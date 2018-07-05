package com.dip.violation;

public class TaxCalculator {
	private LogType logType;
	public TaxCalculator(LogType logType){
		this.logType=logType;
	}
	public int calculate(double salary,int hours)   {
		int tax=0;
		try{
			tax= (int)salary/hours;
			}
		catch(Exception e){
		
		if(logType==LogType.EMAIL){
			Email email=new Email();
			email.log(e.getMessage());
			
			}
		else if(logType==LogType.XML){
			Xml xml=new Xml();
			xml.log(e.getMessage());	
		}
		
		}
		return tax;
		
	}
	

}
