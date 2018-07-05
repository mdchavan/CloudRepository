package com.lsp.violationtest;

import com.lsp.violation.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		JunitTest test=new  JunitTest();
		test.shouldnotChangedHeightIfWidthChanged(new Rectangle(15,10));	
	}
	

}
