package com.java.class10;

public class NestedLoopsDecrement {
	public static void main(String args[]) {

		for (int i = 4; i > 0; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}