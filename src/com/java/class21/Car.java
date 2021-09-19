package com.java.class21;

class car {
	String color = "Blue";
	String model = "BMW 3.16i";
	int price = 3000;
		
	}
class Sports extends car {
	int maxSpeed = 300; 
	
	void Speed() {
		System.out.println(model + maxSpeed);
	}
	

public class Car {
	public static void main(String[] args) {
		car c1 = new car();
		Sports c2 = new Sports();
		
		System.out.println(c1.color);
		
		
		
	}
}
}
