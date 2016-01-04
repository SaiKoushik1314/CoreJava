package com.java.oop;

public class BikeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike1 = new Bike();
		Bike bike2 = new Bike();
		// Invoke methods on those objects
		bike1.speedUp(80);
		bike1.changeGear(2);
		System.out.println("Bike1 Details as follows:");
		bike1.printStates();
		System.out.println();
		bike2.changeColor("Red");
		bike2.changeGear(4);
		bike2.speedUp(100);
		System.out.println("Bike2 Details as follows:");
		bike2.printStates();
	}
}
