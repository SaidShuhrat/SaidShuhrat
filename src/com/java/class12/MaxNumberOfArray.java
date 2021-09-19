package com.java.class12;

//Find greatest number from an array

public class MaxNumberOfArray {
	public static void main(String[] args) {
		int numbers[] = { -43, -46, -47, -40, -12, -35, -10, -65, -4, -321 };

		int max = numbers[0];

		for (int n : numbers) {
			if (n > max) {
				max = n;
			}
		}
		System.out.println(max);

	}
}
