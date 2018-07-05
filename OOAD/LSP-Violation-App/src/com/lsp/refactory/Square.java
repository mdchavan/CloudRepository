package com.lsp.refactory;

public class Square extends Polygaon {
	private int side;
	
	public Square(int side){
		this.side=side;
	}
	public double calculateArea(){
		return side*side;
	}
	
}
