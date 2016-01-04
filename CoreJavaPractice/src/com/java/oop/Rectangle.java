package com.java.oop;

public class Rectangle extends Shape {

	private double width, length;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width * length;
	}

}
