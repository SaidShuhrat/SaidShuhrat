package com.java.class15;

public class ArrayRevision2 {
	public static void main(String[] args) {
		int data[] = { 3, 6, 9, 2, 4 };
		int sum = 0;

		for (int i = 0; i < data.length; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
