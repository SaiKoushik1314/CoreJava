package com.java.oop;

class VehicleTest {
	public static void main(String[] args) {
		// Create two different Vehicle objects
		Vehicle bike1 = new Vehicle();
		Vehicle bike2 = new Vehicle();
		// Invoke methods on those objects
		bike1.speedUp(10);
		bike1.changeGear(2);
		System.out.println("Bike1 Details as follows:");
		bike1.printStates();
		System.out.println();
		bike2.speedUp(10);
		bike2.changeGear(2);
		bike2.speedUp(20);
		bike2.changeGear(3);
		System.out.println("Bike2 Details as follows:");
		bike2.printStates();
	}
}