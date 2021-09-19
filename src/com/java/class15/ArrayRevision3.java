package com.java.class15;

public class ArrayRevision3 {
	public static void main(String[] args) {
		int data[] = { 3, 6, 9, 2, 4 };
		int max = data[0];

		for (int i = 0; i < data.length; i++) {
			if (data[i] < max) {
				max = data[i];
			}
		}
		System.out.println(max);
	}

}
