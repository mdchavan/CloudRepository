package com.dip.refactorytest;

import com.dip.refactory.Email;
import com.dip.refactory.Sms;
import com.dip.refactory.TaxCalculator;

public class RefactoryTest {

	public static void main(String[] args) {
		TaxCalculator taxCalculator=new TaxCalculator(new Email());
		TaxCalculator taxCalculator1=new TaxCalculator(new Sms());
		taxCal(taxCalculator,20000,0);
		taxCal(taxCalculator1,25000,0);
		}

	private static void taxCal(TaxCalculator taxCalculator,double salary,int hours) {
		int tax=taxCalculator.calculate(salary, hours);
		if(tax!=0)
			System.out.println(tax);
	}

}
