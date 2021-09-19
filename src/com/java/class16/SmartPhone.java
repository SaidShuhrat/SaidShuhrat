package com.java.class16;

public class SmartPhone {
	 String screen;
	 String model;
	 String shape;
	 String colour;
	 String camera;
	 
	 int weight;
	 int internalMemoryCard;
	 
	 boolean isTouchableScreen;
	 boolean isFingerPrintOpening;
	 	 
	 void processing( ) {
		 
	 }
	 
	 void takingphoto( ) {
		 System.out.println("Photo taken with " + camera + ' '+ model);
	 }
	 
	 void answerToCall( ) {
		 System.out.println("Calling from "+ model );
	 }
}