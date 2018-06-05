package com.techlab.bmi;

public class BmiCalculator {
	private int weight;
	private int height;
	private float bmi;

	public BmiCalculator(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public float bmiCalculator() {
		bmi = weight / (height * height);
		return bmi;
	}

}
