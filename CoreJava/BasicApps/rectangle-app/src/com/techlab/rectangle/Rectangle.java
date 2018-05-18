package com.techlab.rectangle;

public class Rectangle {

	public static void main(String[] args) {
		int width=10,height=20;
		int areaR=area(width,height);
		System.out.println("Area of rectangle is : "+areaR);
	}
	public static int area(int width,int height){
		return (width*height);
	}
	

}
