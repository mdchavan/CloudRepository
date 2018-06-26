package com.ocp.violationtest;

import com.ocp.violation.FestivelType;
import com.ocp.violation.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fixedDeposit=new FixedDeposit("Mahesh",20000,2,FestivelType.HOLY);

		
		System.out.println("Simple Interest : "+fixedDeposit.calculateInterest());
		

	}

}
