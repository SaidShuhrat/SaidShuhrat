package com.java.class09;

// 1 * 2 * 3 * ...* 5
// Factorial of the given number

public class MultiplicationOf1to10 {
	public static void main(String args[]) {
		int mul = 1;
		for (int i = 1; i <= 5; i++) {
			mul = mul * i;

		}
		System.out.println(mul);
	}
}