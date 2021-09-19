package com.java.class14;

public class StringMethods2 {
	public static void main(String args[]) {
		int a = 10, b = 20, c = 10;
		String s1 = "Hello";
		String s2 = "Hello";	
		String s3 = new String("Hello");
		
		System.out.println(a==b); // False
		System.out.println(a==c); // True
		
		System.out.println(s1==s2); // True
		System.out.println(s3==s2); // False
		
		System.out.println(s2); // Hello
		System.out.println(s3); // Hello
		
		System.out.println(s2.equals(s3)); // True
	}
}
