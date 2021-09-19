package com.java.class13;

// Writea program to find reverse of given number

// input - 6587
// output - 7856

public class ReverseOfNumber {
	public static void main(String args[]) {
		int i = 5782;
		int rev = 0;

		while (i != 0) {
			rev = rev * 10 + i % 10;
			i = i / 10;
		}
		System.out.println(rev);
	}
}
