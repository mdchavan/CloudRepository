package com.dp.stratergytest;

import com.dp.stratergy.Context;
import com.dp.stratergy.DoAddition;
import com.dp.stratergy.DoMultiplication;
import com.dp.stratergy.DoSubtraction;

public class ContextTest {

	public static void main(String[] args) {
		Context contextAdd=new Context(new DoAddition());
		int addition=contextAdd.executeStratergy(20, 40);
		System.out.println("Addition of two integer numbers : "+addition+"\n");
		
		Context contextSub=new Context(new DoSubtraction());
		int subtraction=contextSub.executeStratergy(50, 20);
		System.out.println("Subtraction of two integer numbers : "+subtraction+"\n");
		
		Context contextMul=new Context(new DoMultiplication());
		int multiplication=contextMul.executeStratergy(10, 40);
		System.out.println("Multiplication of two integer numbers : "+multiplication+"\n");

	}

}
