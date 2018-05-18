package com.techlab.loop;

public class DoWhile {

	public static void main(String[] args) {
		int i = 1, j = 0, k = 0;
		int evenArray[] = new int[10];
		int oddArray[] = new int[10];
		do {
			if (i % 2 == 0) {
				evenArray[j] = i;
				j++;
			}

			else {
				oddArray[k] = i;
				k++;
			}

			i++;

		} while (i <= 20);
		System.out.println("Even numbers :");
		for (int l = 0; l < 10; l++)
			System.out.print("  " + evenArray[l]);
		System.out.println();
		System.out.println("Odd numbers :");
		for (int l = 0; l < 10; l++)
			System.out.print("  " + oddArray[l]);
	}

}
