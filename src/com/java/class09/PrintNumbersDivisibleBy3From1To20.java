package com.java.class09;

//Print numbers from 1 to 20 which are divisible by 3
//output - 3 6 9 9 12 15 18

public class PrintNumbersDivisibleBy3From1To20 {
	public static void main(String args[]) {
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				System.out.println(i);

			}
		}
	}
}
