package com.ocp.refactortest;

import com.ocp.refactor.Diwali;
import com.ocp.refactor.FixedDeposit;
import com.ocp.refactor.IFestival;

public class FixedDepositTest {

	public static void main(String[] args) {
		IFestival festival=new Diwali();
		FixedDeposit fixedDeposit=new FixedDeposit("Mahesh",20000.0,2,festival);
	
		
		System.out.println("Simple Interest : "+fixedDeposit.calculateInterest());
		

	}

}
