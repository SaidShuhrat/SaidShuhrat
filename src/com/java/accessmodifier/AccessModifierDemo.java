package com.java.accessmodifier;

public class AccessModifierDemo {
	
	public void displayText() {
		System.out.println("I am a public method body");
	}
	void displayText1() {
		System.out.println("I am a default method body");
	}
	protected void displayText2() {
		System.out.println("I am a protected method body");
	}
	private void displayText3() {
		System.out.println("I am a private method body");
	}
	public static void main(String[] args) {
		AccessModifierDemo obj = new AccessModifierDemo();
		
		obj.displayText();
		obj.displayText1();
		obj.displayText2();
		obj.displayText3();
	}

}
