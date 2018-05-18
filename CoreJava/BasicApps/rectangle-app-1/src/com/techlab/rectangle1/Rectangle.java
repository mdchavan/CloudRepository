package com.techlab.rectangle1;

public class Rectangle {
	private int height;
	private int width;
	public void setData(int height,int width){
		this.height=height;
		this.width=width;
	}
	public int calculateArea(){
		return height*width;
	}

}
