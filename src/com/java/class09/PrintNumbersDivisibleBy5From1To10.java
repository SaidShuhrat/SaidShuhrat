package com.java.class09;

public class PrintNumbersDivisibleBy5From1To10 {

	public static void main(String args[]) {
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
			if (i % 5 == 0) {
				System.out.println(i);

			}
		}
	}
}
