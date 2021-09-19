package com.java.class10;

public class NestedLoopsPatternsDecrement {
	public static void main(String args[]) {
		for (int i = 5; i > 0; i--) {

			for (int s = 5; s > i - 1; s--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
