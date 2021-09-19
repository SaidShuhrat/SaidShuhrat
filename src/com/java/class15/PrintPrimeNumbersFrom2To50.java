package com.java.class15;

// Print Prime Numbers from 2 to 50

public class PrintPrimeNumbersFrom2To50 {
	public static void main(String args[]) {
		for (int i = 2; i <= 50; i++) {
			if (isPrime(i) == true) {
				System.out.println(i);
			}

		}
	}

	static boolean isPrime(int num) {
		boolean flag = false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = true;
			}
		}
		if (flag == false) {
			return true;
		} else {
			return false;
		}
	}
}
