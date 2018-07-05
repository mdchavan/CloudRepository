package com.dip.refactory;

public class Xml implements ILogType {

	@Override
	public void log(String errorMessage) {
		System.out.println("Xml log : \n"+errorMessage);
		}

}
