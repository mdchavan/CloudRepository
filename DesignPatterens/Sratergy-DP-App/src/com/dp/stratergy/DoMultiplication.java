package com.dp.stratergy;

public class DoMultiplication implements IStratergy {

	@Override
	public int doOperation(int firstNumber, int secondNumber) {
		return firstNumber*secondNumber;
	}

}
