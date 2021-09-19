package com.java.class13;

public class PrimeNumber2 {
	public static void main(String[] args) {

		int num = 60;
		boolean flag = false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = true;
			}
		}

		if (flag == false) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

	}
}
