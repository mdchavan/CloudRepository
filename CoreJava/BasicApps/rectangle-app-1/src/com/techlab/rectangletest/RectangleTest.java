package com.techlab.rectangletest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.techlab.rectangle1.Rectangle;

public class RectangleTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rectangle height and width .");
		int height = Integer.parseInt(br.readLine());
		int width = Integer.parseInt(br.readLine());
		if (height < 1)
			height = 1;
		else if (height > 100)
			height = 100;
		if (width < 1)
			width = 1;
		else if (width > 100)
			width = 100;
		Rectangle rectangle = new Rectangle();
		rectangle.setData(height, width);
		int area = rectangle.calculateArea();
		System.out.println("Area of rectangle is " + area);

	}

}
