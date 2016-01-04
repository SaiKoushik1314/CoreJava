package com.java.oop;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle();
		r.setWidth(10.4);
		r.setLength(4.4);
		System.out.println("rectangle width= " + r.getWidth());
		System.out.println("rectangle length= " + r.getLength());
		System.out.println("area of rectangle= " + r.getArea());

		Circle c = new Circle();
		c.setRadius(4.4);
		System.out.println("radius is= " + c.getRadius());
		System.out.println("area of circle is= " + c.getArea());

		Shape shapes[] = { r, c };
		for (Shape s : shapes) {
			System.out.println("class of object: " + s.getClass());
			System.out.println("area of object " + s.getArea());
		}
	}

}
