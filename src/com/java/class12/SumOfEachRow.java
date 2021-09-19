package com.java.class12;

// Fınd sum of Each Row

public class SumOfEachRow {

	public static void main(String[] args) {

		int numbers[][] = { { 4, 5, 9, 5 }, { 1, 2, 6, 4, }, { 1, 4, 9, 6 } };

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			sum = 0;
			
			for (int j = 0; j < numbers[i].length; j++) {

				sum = sum + numbers[i][j];

			}
			System.out.println(sum);
		}
	}
}
