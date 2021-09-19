package com.java.class11;

public class FindIndexNumber {
	public static void main(String[] args) {

		int numbers[] = { 43, 46, 47, 40, 12, 35 };

		int targetNumber = 47;
		
		for (int i = 0; i < numbers.length; i++) {
		
			if (numbers[i] == targetNumber) {
			
				System.out.println(i);
			}
		}
	}
}
