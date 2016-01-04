package com.java.oop;

public class Box {

	private double width, height, depth;

	public Box() {
		width = 1;
		height = 1;
		depth = 1;
	}

	public Box(double d, double e, double f) {
		width = d;
		height = e;
		depth = f;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double volume() {
		return width * height * depth;

	}
}
