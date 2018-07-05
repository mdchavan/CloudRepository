package com.dip.refactory;

public class TaxCalculator {
	private ILogType logType;
	public TaxCalculator(ILogType logType){
		this.logType=logType;
	}
	public int calculate(double salary,int hours) {
		int tax=0;
		try{
			tax=(int)salary/hours;
		}catch(Exception e){
			logType.log(e.getMessage());
			
		}
		return tax;
	}

}
