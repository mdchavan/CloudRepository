package com.techlab.bmitest;

import com.techlab.bmi.BmiCalculator;

public class BmiCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BmiCalculator bmiCal = new BmiCalculator(2, 160);
		float bmi = bmiCal.bmiCalculator();
		System.out.println("Bmi is : " + bmi);
		if (bmi < 18.5)
			System.out.println("Under Weight :");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else if (bmi >= 30)
			System.out.println("Obsese");

	}

}
