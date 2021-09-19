package com.java.class14;

public class HelloWorld3 {
	public static void main(String args[]) {
		int i = 1;
		int count = 0;

		while (i <= 10) {
			count = count + 2;
			System.out.println(i);
			i = count;
		}
	}
}
