package com.java.accessmodifier;

public class AccessModifierCaller {

	public static void main(String[] args) {
		AccessModifierDemo obj = new AccessModifierDemo();
		
		obj.displayText();
		// accessing public methods within same package+
		
		obj.displayText1();
		// accessing default methods within same package+
		
		obj.displayText2();
		// accessing protected methods within same package+
		
		// obj.displayText3();
		// private method is not accessible
		// private method used for protect your variables and methods
	}
}
