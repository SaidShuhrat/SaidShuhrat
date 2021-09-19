package com.java.class15;

// Print even numbers from1 to 20

public class Exercises5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (isEven(i) == true) {
				System.out.println(i);
			}
		}
	}

	// Function definition
	static boolean isEven(int i) {
		int num = 2;
		
		if(i % 2 == 0 ) {
			return true;
		} else {
			return false;
		}
	}
}
