package com.techlab.circletest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.techlab.circle1.Circle1;

public class CircleTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter radius of circle");
		int radius = Integer.parseInt(br.readLine());
		if (radius < 1)
			radius = 1;
		else if (radius > 100)
			radius = 100;
		Circle1 circle = new Circle1();
		circle.setData(radius);
		double area = circle.areaCircle();
		System.out.println("Area of circle is :" + area);

	}

}
