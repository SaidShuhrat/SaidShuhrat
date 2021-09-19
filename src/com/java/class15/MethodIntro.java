package com.java.class15;

public class MethodIntro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		printline('=', 20);    // 20
		
		System.out.println("Welcome to Odd-Even Tool");
		printline('=', 25);    // 25

		System.out.println("Enter the number to check it is even or odd");
		
		printline('-', 30);    // 30
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + "is Even");
			printline('#', 15);    // 15

		} else {
			System.out.println(num + "is Odd");
			printline('#', 15);    // 15
		}
	}

	static void printline(char c, int length) {
		for (int i = 1; i <= length; i++) {
			System.out.print(c);
		}
	}
}
