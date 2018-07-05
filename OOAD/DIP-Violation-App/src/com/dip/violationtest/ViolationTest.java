package com.dip.violationtest;

import com.dip.violation.LogType;
import com.dip.violation.TaxCalculator;

public class ViolationTest {

	public static void main(String[] args) {
		TaxCalculator taxCalculator=new TaxCalculator(LogType.EMAIL);
		int tax=taxCalculator.calculate(25000, 0);
		if(tax!=0)
		System.out.println(tax);
		TaxCalculator taxCalculator1=new TaxCalculator(LogType.XML);
		int tax1=taxCalculator1.calculate(25000, 0);
		if(tax1!=0)
		System.out.println(tax1);
		
	}

}
