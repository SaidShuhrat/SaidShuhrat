package com.java.class15;

public class ScopeOfTheVariable {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			// System.out.println(i); // 1, 2, 3, 4, 5, 6, 7, 8, 9
		}
		  System.out.println(i); //  compilation error
	}
}
