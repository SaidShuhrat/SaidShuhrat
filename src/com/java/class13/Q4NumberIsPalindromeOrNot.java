package com.java.class13;

// Check if given number is Palindrome or not

public class Q4NumberIsPalindromeOrNot {
	public static void main(String args[]) {
		int i = 575;
		int rev = 0;

		while (i != 0) {
			rev = rev * 10 + i % 10;
			i = i / 10;
		}
		
	if (rev == i) {
		System.out.println("Number is Prime number");
	} else {
		System.out.println("Number is not prime number");
	}
}}
