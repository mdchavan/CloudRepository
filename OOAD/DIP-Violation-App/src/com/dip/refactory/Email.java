package com.dip.refactory;

public class Email implements ILogType{

	@Override
	public void log(String errorMessage) {
	System.out.println("Email log : \n"+errorMessage);
	}

}
