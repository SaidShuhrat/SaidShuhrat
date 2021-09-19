package com.java.class09;

public class DivisbleBy3From1To5 {
	public static void main(String args[]) {
		for (int i = 1; i <= 5; i++) {
			if (i % 3 == 0) {
				i++;

			}
			System.out.println(i);
		}
	}
}
