package com.java.class20;

// Make program for given number is Prime or not

public class GiveNumberPrimeOrNot {
	public static void main(String args[]) {
		int num = 15;
		int divisor = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisor++;
				System.out.println(i);
			}
		}
		if (divisor == 0) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is Not Prime");

		}
	}
}
