package com.java.class12;

public class TwoDArray {
	public static void main(String[] args) {

		int data[][] = new int[4][5];
		
		int numbers[][] = { { 4, 5, 9, 5 }, { 1, 2, 6, 4, }, { 1, 4, 9, 6} };
		
		System.out.println(numbers[1][1]);
		
		//Number of rows in array
		System.out.println(numbers.length);
		
		//Number of column in particular row
		System.out.println(numbers[2].length);
		
		//All Numbers of table
		for (int i = 0; i<numbers.length; i++) {
				for (int j = 0; j<numbers[i].length; j++) {
				
				System.out.print(numbers[i][j]);
				}
				System.out.println();
				
		//All Numbers of table
		System.out.print(numbers[0][0]);
		System.out.print(numbers[0][1]);
		System.out.print(numbers[0][2]);
		System.out.print(numbers[0][3]);
		
		System.out.println();
		
		System.out.print(numbers[1][0]);
		System.out.print(numbers[1][1]);
		System.out.print(numbers[1][2]);
		System.out.print(numbers[1][3]);
		
		System.out.println();
		
		System.out.print(numbers[2][0]);
		System.out.print(numbers[2][1]);
		System.out.print(numbers[2][2]);
		System.out.print(numbers[2][3]);
		
		System.out.println();
}
}}
