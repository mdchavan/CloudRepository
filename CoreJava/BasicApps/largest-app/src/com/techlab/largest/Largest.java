package com.techlab.largest;

public class Largest {

	public static void main(String[] args) {
		 int num1=20,num2=40;
		
		System.out.println("First number : "+num1+" Second number : "+num2);
		int largernumber=largest(num1,num2);
		if(largernumber==num1)
		System.out.println("Number first is largest number "+largernumber);
		System.out.println("Big number"+num2);
	}
		public static int largest(int num1,int num2){
		if(num1>num2)
			return num1;
		return num2;

		}

}
