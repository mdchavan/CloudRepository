package com.lsp.violationtest;

import com.lsp.violation.Square;

public class SquareTest {

	public static void main(String[] args) {
		JunitTest test=new  JunitTest();
		test.shouldnotChangedHeightIfWidthChanged(new Square(10,10));	
	}

}
