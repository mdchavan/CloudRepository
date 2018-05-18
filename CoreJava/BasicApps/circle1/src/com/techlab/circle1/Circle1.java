package com.techlab.circle1;

public class Circle1 {
	private int radius;
	private double PI = 3.14;

	public void setData(int radius) {
		this.radius = radius;
	}

	public double areaCircle() {
		return PI * radius * radius;
	}

}
