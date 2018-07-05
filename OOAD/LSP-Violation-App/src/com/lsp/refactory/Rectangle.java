package com.lsp.refactory;

public class Rectangle extends Polygaon {
	private int height;
	private int width;
	
	public Rectangle(int height,int width){
		this.height=height;
		this.width=width;
	}

	@Override
	public double calculateArea() {
		return height*width;
	}

}
