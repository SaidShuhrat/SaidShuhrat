package com.java.class14;

// Write a program to count number of vowels, digit, spaces from the spring

public class StringMethodExamples2 {
	public static void main(String args[]) {
		String str = "This is our 14th class and we will be completing String class today";

		int numberOfVowels = 0;
		int digit = 0;
		int spaces = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'o' || str.charAt(i) == 'i') {
				numberOfVowels++;
			} else if (str.charAt(i) == '0' || str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '4') {
				digit++; 
				
			} else if (str.charAt(i) == ' ') {
				spaces++;
			}
		}
		System.out.println("Number of Vowels - " + numberOfVowels);
		System.out.println("Number of digit - " + digit);
		System.out.println("Number of spaces - " + spaces);

	}
}
