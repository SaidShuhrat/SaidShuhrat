package com.java.class06;

public class PrintNumberOfDaysInMonth {
	public static void main(String args[]) {
		int num = 1;

		switch (num) {
		case 1:
			System.out.println("January is 31 days");
			break;
		case 2:
			System.out.println("February is 28/29 days");
			break;
		case 3:
			System.out.println("March is 31 days");
			break;
		case 4:
			System.out.println("April is 30 days");
			break;
		case 5:
			System.out.println("May is 31 days");
			break;
		case 6:
			System.out.println("June is 30 days");
			break;
		case 7:
			System.out.println("July is 31 days");
			break;
		case 8:
			System.out.println("August is 31 days");
			break;
		case 9:
			System.out.println("September is 30 days");
			break;
		case 10:
			System.out.println("October is 31 days");
			break;
		case 11:
			System.out.println("November is 30 days");
			break;
		case 12:
			System.out.println("December is 31 days");
			break;
		default:
			System.out.println("Enter 1-12 only");

		}
	}
}
