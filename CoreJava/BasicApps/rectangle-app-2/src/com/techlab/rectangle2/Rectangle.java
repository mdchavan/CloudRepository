package com.techlab.rectangle2;

public class Rectangle {
	private int height;
	private int width;

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
