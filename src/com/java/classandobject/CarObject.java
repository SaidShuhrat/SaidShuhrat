package com.java.classandobject;

public class CarObject {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		// We create an OBJECT of the Class CAR or in other words instantiate a class
		
		// Car : name of the class (blueprint = taslak)
		
		// car1 = reference variable (can be any name)
		
		// new - helps to create a class
		
		// Car() - constructor
		
		car1.brand = "Tesla";
		car1.color = "Red";
		car1.interior = "Beige Leather";
		car1.maxSpeed = 400;
		car1.safe = true;
		
		System.out.println("-------Object 1 : Car 1------");
		System.out.println("We created a first car and its brand is " + car1.brand + " with " + car1.interior + " and its color is " + car1.color + " and it has a maximum speed of " + car1.maxSpeed);
		
		System.out.println("-------Car 1 Behaviors------");
	car1.drive();
	car1.stop();
	car1.reverse();
	car1.accelerate();
	
	Car car2 = new Car();
	
	car2.brand = "Mercedes";
	car2.color = "Gray";
	car2.interior = "Black Leather";
	car2.maxSpeed = 320;
	car2.safe = true;
	
	System.out.println("-------Object 2 : Car 2------");
	System.out.println("We created a first car and its brand is " + car2.brand + " with " + car2.interior + " and its color is " + car2.color + " and it has a maximum speed of " + car2.maxSpeed);
	
	System.out.println("-------Car 2 Behaviors------");
car2.drive();
car2.stop();
car2.reverse();
car2.accelerate();
	}
	
}
