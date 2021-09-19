package com.java.class13;

// Write a program to check given number is prime or not

// input - 13
// Number is prime

// Prime number can be divisible by only two numbers
// 1 and itself

public class PrimeNumber {
	public static void main(String args[]) {
		int num = 20;
		int divisor = 0;

		// for(int i = 1; i <= num; i++) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(i);
				divisor++;
			}
		}

		// if (divisor == 2 ) {
		if (divisor == 0) {
			System.out.println("Number is Prime number");
		} else {
			System.out.println("Number is not prime number");
		}
	}
}
