package com.java.class13;

public class WhileLoopExample5 {
	public static void main(String args[]) {
		int i = 1;
		while (i <= 5) {
			if (i % 3 == 0) {
				i--;

			}
			System.out.println(i);
			i++;
		}
	}
}
