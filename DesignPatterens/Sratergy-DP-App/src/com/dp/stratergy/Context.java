package com.dp.stratergy;

public class Context {
	private IStratergy stratergy;
	public Context(IStratergy stratergy){
		this.stratergy=stratergy;
	}
	public int executeStratergy(int firstNumber,int secondNumber){
		return stratergy.doOperation(firstNumber, secondNumber);
	}

}
