package com.java.class13;

//Write a program to find sum of digits of given number

//input - 23145789
//output - 2+3+1+4+5+7+8+9=39

public class Q3SumOfDigitFromTheNumberHM {
	public static void main(String args[]) {
		int i = 23145789;
		int sum = 0;

		while (i != 0) {
			sum = sum + i % 10;
			i = i / 10;
		}
		System.out.println(sum);
	}
}