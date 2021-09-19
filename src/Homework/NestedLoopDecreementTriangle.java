package Homework;

//123451234
// 1234123
//  12312
//   121
//    1

public class NestedLoopDecreementTriangle {
	public static void main(String args[]) {
		for (int i = 5; i > 0; i--) {
			
		}
			for (int s = 5; s > i - 1; s--) {
				System.out.print(" ");
		}
			for (int j = 1; j <= i + 1; j++) {
			System.out.print(j);
	}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
	}
	System.out.println();
}
}