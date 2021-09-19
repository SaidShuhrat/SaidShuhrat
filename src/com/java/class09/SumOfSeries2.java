package com.java.class09;

// 1/2 + 2/3 + 3/4 + ..... +10/11

public class SumOfSeries2 {

	public static void main(String args[]) {
		
		double sum = 0; 
							
		for (double i = 1.0; i <= 10; i++) {
			
			sum = sum + (double)i / (i + 1);	
					}
		System.out.println(sum);
	}
}
