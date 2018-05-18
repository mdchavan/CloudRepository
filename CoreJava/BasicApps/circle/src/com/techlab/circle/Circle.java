package com.techlab.circle;
import java.io.*;
public class Circle {
	static double PI=3.14;
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enetr radius of circle");
		int radius=Integer.parseInt(br.readLine());
		double area=calculateArea(radius);
		System.out.println("Area of circle is :"+area);
	}
	public static double calculateArea(int radius){
		return(PI*radius*radius);
	}
}