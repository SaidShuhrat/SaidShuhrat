package Homework;

public class MaxNumberFromThreeNumbers {
	public static void main(String args[]) {
		int a = 35, b = 53, c = 46;
				

		if (a > b )  {
			if (a > c) {
				System.out.println(a + " is biggest number");
			} else {
				System.out.println(c + " is biggest number");
			}

		} else {
			if (b > c) {
				System.out.println(b + " is biggest number");
			} else {
				System.out.println(c + " is biggest number");
			}
		}
	}
}
