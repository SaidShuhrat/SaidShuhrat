package com.java.class03;

public class StringConcatination {
	public static void main(String args[]) {
		String str1 = "HELLO";
		String str2 = "TEAM";
		String said = " ";

		int a = 40;
		int b = 30;

		System.out.println(str1 + said + str2);

		System.out.println(str1 + a);

		System.out.println(str1 + a + b);

		System.out.println(a + b + str1);

		System.out.println(a + b + said + str2);

		System.out.println(str1 + said + str2 + said + a + b);

		System.out.println(a + said + str2 + said + b + said + str1);

		System.out.println(str2 + (a - b));

		System.out.println(str2 + said + (b - a));

		System.out.println(str2 + said + (b - a) + said + str1);

	}
}
