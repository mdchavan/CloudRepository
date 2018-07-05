package com.dp.stratergy;

public class DoAddition implements IStratergy {

	@Override
	public int doOperation(int firstNumber, int secondNumber) {
		return firstNumber+secondNumber;
	}

}
