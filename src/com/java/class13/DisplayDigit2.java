package com.java.class13;

//Write a program to seperate each digit from the number
//Input - 5782
//Output
//2
//8
//7
//5

public class DisplayDigit2 {
	public static void main(String args[]) {
		int i = 5782;

		while (i != 0) {
		System.out.println(i % 10);
		i = i / 10;
		}

	}
}