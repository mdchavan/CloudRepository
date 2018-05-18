package com.techlab.circle2;

public class Circle {

	private float radius;
	private float PI = 3.14f;
	private BorderStyle border;

	public void setRadius(float radius) {
		if (radius < 0)
			System.out.println("Enter positive radius .");
		else
			this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setBorder(BorderStyle border) {
		this.border = border;
	}

	public BorderStyle getBorder() {
		return border;
	}

	public float calcluteArea() {
		return PI * radius * radius;
	}

}
