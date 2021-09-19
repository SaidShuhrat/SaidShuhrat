package com.java.class08;

public class JavaReview {
	public static void main(String[] args) {
		String country = "india";

		switch (country) {

		case "india":
			System.out.println("Delhi");
			break;
		case "USA":
			System.out.println("Washington");
			break;
		case "Turkey":
			System.out.println("Ankara");
			break;
		default:
			System.out.println("Please enter valid country");
		}
	}
}
