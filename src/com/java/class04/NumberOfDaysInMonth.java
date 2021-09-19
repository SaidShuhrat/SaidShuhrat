package com.java.class04;

//Write a program to print number of days in a given month 

//1 - 31 days
//2 - 28/29 days
//3 - 31 days
//4 - 30 days
//..12 - 31 days

public class NumberOfDaysInMonth {
	public static void main(String args[]) {
		int num = 2;

		if (num == 1) {
			System.out.println("31");
		} else if (num == 2) {
			System.out.println("28/29");
		} else if (num == 3) {
			System.out.println("31");
		} else if (num == 4) {
			System.out.println("30");
		} else if (num == 5) {
			System.out.println("31");
		} else if (num == 6) {
			System.out.println("30");
		} else if (num == 7) {
			System.out.println("31");
		} else if (num == 8) {
			System.out.println("30");
		} else if (num == 9) {
			System.out.println("30");
		} else if (num == 10) {
			System.out.println("31");
		} else if (num == 11) {
			System.out.println("30");
		} else if (num == 12) {
			System.out.println("31");
		} else {
			System.out.println("Please enter number between 0-12...");

		}
	}
}
