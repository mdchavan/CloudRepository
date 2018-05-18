package com.techlab.circletest2;

import com.techlab.circle2.BorderStyle;
import com.techlab.circle2.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(10.0f);
		float area = circle.calcluteArea();
		circle.setBorder(BorderStyle.SOLID);
		System.out.println("Border style is " + circle.getBorder());
		System.out.println("Area of circle is : " + area);
	}

}
