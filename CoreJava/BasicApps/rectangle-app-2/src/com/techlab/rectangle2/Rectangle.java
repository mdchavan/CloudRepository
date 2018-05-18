package com.techlab.rectangle2;

public class Rectangle {
	private int height;
	private int width;
	private String color;

	public void setHeight(int height) {
		this.height = checkRange(height);
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {

		this.width = checkRange(width);

	}

	public int getWidth() {
		return width;
	}

	public void setColor(String color) {
		if (color.equalsIgnoreCase("red"))
			this.color = color;
		else if (color.equalsIgnoreCase("green"))
			this.color = color;
		else if (color.equalsIgnoreCase("blue"))
			this.color = color;
		else
			this.color = "red";
	}

	public String getColor() {
		return color;
	}

	public int calculateArea() {
		return height * width;
	}

	public int checkRange(int dimension) {
		if (dimension < 1)
			dimension = 1;
		else if (dimension > 100)
			dimension = 100;
		return dimension;
	}

}
