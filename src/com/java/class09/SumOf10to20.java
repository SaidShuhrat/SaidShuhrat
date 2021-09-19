package com.java.class09;

//10 + 11 + 12 + 13 + ...+ 20

public class SumOf10to20 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 10; i <= 20; i++) {
			sum = sum + i;
		}

		System.out.println(sum);
	}
}

