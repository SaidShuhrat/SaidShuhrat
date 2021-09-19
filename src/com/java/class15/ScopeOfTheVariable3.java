package com.java.class15;

public class ScopeOfTheVariable3 {
	public static void main(String[] args) {
		int i = 1;
		
		while (i <=10) {
			int count = 0;
			i++;
			count++;
		}
		System.out.println(i);
		System.out.println(count); // compilation problem, before curly bracket definited be
	}

}
