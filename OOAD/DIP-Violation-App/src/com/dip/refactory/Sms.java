package com.dip.refactory;

public class Sms implements ILogType {

	@Override
	public void log(String errorMessage) {
		System.out.println("Sms log : \n"+errorMessage);
		}

}
