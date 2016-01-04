package com.java.oop;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box();
		// b1.setWidth(10.5);
		// b1.setHeight(5.0);
		// b1.setDepth(3.2);

		System.out.println("Box b1 details:");
		System.out.println("width: " + b1.getWidth());
		System.out.println("height: " + b1.getHeight());
		System.out.println("depth: " + b1.getDepth());
		System.out.println("volume: " + b1.volume());

		Box b2 = new Box(2.5, 3.5, 4.0);
		System.out.println("Box b2 details:");
		System.out.println("width: " + b2.getWidth());
		System.out.println("height: " + b2.getHeight());
		System.out.println("depth: " + b2.getDepth());
		System.out.println("volume: " + b2.volume());

	}

}
