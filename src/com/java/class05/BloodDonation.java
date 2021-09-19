package com.java.class05;

//Take age & weight from user

//1. age >= 18 and weight >= 50 --> You're eligible 
//2. age >= 18 and weight < 50  --> You're under weight
//3. age < 18 and weight >= 50  --> You're too young to donate blood
//4. age < 18 and weight < 50  --> You're not eligible

public class BloodDonation {
	public static void main(String args[]) {
		int a = 20, w = 52;

		if (a >= 18) {

			if (w >= 50) {
				System.out.println("You are eligible");
			} else {
				System.out.println("You are under weight");

			}
		} else {

			if (w >= 50) {
				System.out.println("You are too young to donate blood");
			} else {
				System.out.println("You are not eligible");
			}
		}
	}
}
