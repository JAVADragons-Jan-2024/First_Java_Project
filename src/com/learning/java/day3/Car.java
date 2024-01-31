package com.learning.java.day3;

public class Car {
	String name;
	String color;
	String model;
	int mfgyear;
	int mileage;
	static int noOfwheels = 4;

	// difference between static and non-static variables /methods
	// -> when it is static it belongs to that class
	// -> non static variables /methods, nothing but a variables /methods without
	// keyword "static"
	// these are belong to instances of class.

	
	public static void turnOnLights() {
		System.out.println("Lights will turn on");
	}

	public void driveCar() {
		System.out.println("This car is in Drive mode");
	}

	public void startCar() {

	}
	
	

}
