package Homework;

//    1
//   121
//  12312
// 1234123
//123451234
// 1234123
//  12312
//   121
//    1


public class NestedLoopPatternsRomb02SeptemberHM {
	

	public static void main(String args[]) {
		
		for (int i = 3; i <= 3; i--) {

			for (int s = 4; s <= 4 + i; s--) {
				System.out.print(" ");
			}
			for (int j = 4; j <= i - 1; j--) {
				System.out.print(j);
			}
			for (int j = 1; j <= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
