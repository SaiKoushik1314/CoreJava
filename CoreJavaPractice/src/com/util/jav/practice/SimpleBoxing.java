package com.util.jav.practice;

public class SimpleBoxing {
	public static void main(String[] args) {
		Integer n1 = new Integer(43);
		int i1 = n1; // unboxing
		int i2 = 57;
		Integer n2 = i2; // boxing
		System.out.println(n1 + " " + n2 + " " + i1 + " " + i2);
	}
}
