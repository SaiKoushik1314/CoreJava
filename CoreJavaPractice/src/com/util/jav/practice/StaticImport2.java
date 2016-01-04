package com.util.jav.practice;

import static java.lang.System.out;
import static java.lang.Math.PI;

class StaticImport2 {
	public static void main(String[] args) {
		double radius = 3.0;
		double area = PI * radius * radius;
		out.println("Area of the circle whose radius: " + radius + " is: " + area);
	}
}
