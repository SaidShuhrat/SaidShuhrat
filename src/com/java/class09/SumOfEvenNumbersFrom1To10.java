package com.java.class09;

public class SumOfEvenNumbersFrom1To10 {
	public static void main(String args[]) {
		int sum = 0;
		for (int i = 2; i <= 10; i = i + 2) {
			sum = sum + i;

		}
		System.out.println(sum);
	}
}
