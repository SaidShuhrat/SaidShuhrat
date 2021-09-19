package com.java.class22;

class Luminaire2 {
	int outputLumen;

	void displayOutPut() {
		System.out.println("Luminaire is with " + "1000" + " Lumen");
	}
}

class IndoorLuminaire extends Luminaire2 {
	void displayOutPut() {
		System.out.println("Luminaire is with " + "1500" + " Lumen");
	}
}

class OutdoorLuminaire extends Luminaire2 {
	void displayOutPut() {
		System.out.println("Luminaire is with " + "1600" + " Lumen");
	}
}
	public class MethodOverRidingExamples {
		public static void main(String[] args) {
			IndoorLuminaire L1 = new IndoorLuminaire();
			OutdoorLuminaire L2 = new OutdoorLuminaire();
			L1.displayOutPut();
			L2.displayOutPut();

		}
	}
F
