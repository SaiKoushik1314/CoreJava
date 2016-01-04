package com.java.funda;

public class DivideNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		division(100, 4);
		division(100, 0);
		System.out.println("End");
	}

	private static void division(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("Computing Division.");
		int avg = i / j;
		System.out.println("Average : " + avg);
	}

}
