package com.techlab.rectangletest2;

import com.techlab.rectangle2.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(5);
		rectangle.setWidth(10);
		int area = rectangle.calculateArea();
		System.out.println("Area of rectangle is : " + area);

	}

}