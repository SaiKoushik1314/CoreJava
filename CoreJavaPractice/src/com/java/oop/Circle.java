package com.java.oop;

public class Circle extends Shape {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		return 2 * 3.14 * radius * radius;
	}
}
