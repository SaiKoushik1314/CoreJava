package com.java.oop;

public class C implements I, J {

	@Override
	public boolean isDivisible(int x, int y) {
		return (x % y == 0);
	}

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {

		int i = 19, j = 2;
		C c1 = new C();
		System.out.println("Sum of " + i + " and " + j + " is: " + c1.add(i, j));
		System.out.println("Difference of " + i + " and " + j + " is: " + c1.sub(i, j));
		boolean test = c1.isDivisible(i, j);
		if (test == true) {
			System.out.println(i + " is divisible by " + j);
		} else {
			System.out.println(i + " is not divisible by " + j);
		}

	}

}
