package com.java.class15;

//Print Palindrom Numbers from 2 to 99

public class PrintPalindromFrom2To99 {
	public static void main(String args[]) {
		for (int i = 2; i <= 99; i++) {
			if (isPalindrom(i) == true) {
				System.out.println(i);
			}
		}
	}
	static boolean isPalindrom(int num) {
		int rev = 0;
		int backup = num;
		
			while (num != 0) {
				rev = rev * 10 + num % 10;
				num = num / 10;
					}
		if (rev == backup) {
			return true;
		} else {
			return false;
		}
	}
}

