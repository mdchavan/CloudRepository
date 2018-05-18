package com.techlab.switchdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonthDisplay {
	public static final int JANUARY = 1;
	public static final int FEBRUARY = 2;
	public static final int MARCH = 3;
	public static final int APRIL = 4;
	public static final int MAY = 5;
	public static final int JUNE = 6;
	public static final int JULY = 7;
	public static final int AUGUST = 8;
	public static final int SEPTEMBER = 9;
	public static final int OCTOBER = 10;
	public static final int NOVEMBER = 11;
	public static final int DECEMBER = 12;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Month number ");
		int monthnumber = Integer.parseInt(br.readLine());
		switch (monthnumber) {
		case JANUARY:
			System.out.println("  1 : Januvari");
			break;
		case FEBRUARY:
			System.out.println("  2 : Februvari");
			break;
		case MARCH:
			System.out.println("  3 : March");
			break;
		case APRIL:
			System.out.println("  4 : April");
			break;
		case MAY:
			System.out.println("  5 : May");
			break;
		case JUNE:
			System.out.println(" 6  : Jun");
			break;
		case JULY:
			System.out.println("  7 : Jully");
			break;
		case AUGUST:
			System.out.println("  8 : August");
			break;
		case SEPTEMBER:
			System.out.println("  9 : September");
			break;
		case OCTOBER:
			System.out.println("  10 : Octomber");
			break;
		case NOVEMBER:
			System.out.println("  11 : Novhber");
			break;
		case DECEMBER:
			System.out.println("  12 : December");
			break;
		default:
			System.out.println("Must enter in between 1 to 12");
		}

	}

}
