package com.java.class15;

public class PrintNumbers11To30InReverseMannerHM12September {
	public static void main(String[] args) {
		for (int i = 11; i <= 30; i++) {
			if (isRev(i) == true) {
				System.out.println(i);
			}
		}
	}
	static boolean isRev(int num) {	
		boolean flag = false;
		int i = 11;
		int rev = 0;
		while (i != 0) {
			rev = rev * 10 + i % 10;
			i = i / 10;
		}	
		if(flag==false)	{
		return true;
	}else {
		return false;
	}
}
}



