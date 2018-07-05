package com.lsp.refactorytest;

import org.junit.Test;

import com.lsp.refactory.Polygaon;
import com.lsp.refactory.Rectangle;

public class PolygaonTest {
@Test
	public static void main(String[] args) {
		Polygaon polygaon=new Rectangle(10,20);
		System.out.println("Area of rectangle : "+polygaon.calculateArea());
		JUnitTest junit=new JUnitTest();
		
		junit.getArea(polygaon);
	}

}
