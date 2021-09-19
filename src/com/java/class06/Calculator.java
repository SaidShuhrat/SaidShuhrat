package com.java.class06;

//Input - 10, 20, mul 
//Output - 200

public class Calculator {
	public static void main(String args[]) {
		int num1 = 10, num2 = 20;

		String operation = "Multiplication";

		switch (operation) {
		case "Addition":
			System.out.println(num1 + num2);
			break;
		case "Subtraction":
			System.out.println(num1 - num2);
			break;
		case "Division":
			System.out.println(num1 / num2);
			break;
		case "Multiplication":
			System.out.println(num1 * num2);

		}
	}
}
