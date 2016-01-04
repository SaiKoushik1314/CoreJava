package com.java.funda;

public class DivideNumberException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		int result = division(100, 10);
		System.out.println("Result: " + result);
		System.out.println("End");

	}

	private static int division(int i, int j) {
		int quotient = 0;
		System.out.println("Computing Division.");
		try {
			quotient = i / j;
		} catch (ArithmeticException e) {
			System.out.println("Exception: " + e.getMessage());
		} finally {
			if (quotient != 0) {
				System.out.println("Finally block executed");
			} else {
				System.out.println("Finally block executed, but Exception occurred");
			}

		}
		return quotient;

	}

}
