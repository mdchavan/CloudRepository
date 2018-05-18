package com.techlab.rectangle2;

public class Rectangle {
	private int height;
	private int width;

	public void setHeight(int height) {
		if (height < 1)
			this.height = 1;
		else if (height > 100)
			this.height = 100;
		else
			this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		if (width < 1)
			this.width = 1;
		else if (width > 100)
			this.width = 100;
		else
			this.width = width;

	}

	public int getWidth() {
		return width;
	}

	public int calculateArea() {
		return height * width;
	}

}
