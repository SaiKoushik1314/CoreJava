package com.java.funda;

public class SwitchTest {
	public static void main(String args[]) {
		if (args.length > 0) {
			int number = Integer.parseInt(args[0]);
			switch (number) {
			case 0:
				System.out.println("ZERO");
				break;
			case 1:
				System.out.println("ONE");
				break;
			case 2:
				System.out.println("TWO");
				break;
			case 3:
				System.out.println("THREE");
				break;
			case 4:
				System.out.println("FOUR");
				break;
			case 5:
				System.out.println("FIVE");
				break;
			case 6:
				System.out.println("SIX");
				break;
			case 7:
				System.out.println("SEVEN");
				break;
			case 8:
				System.out.println("EIGHT");
				break;
			case 9:
				System.out.println("NINE");
				break;
			default:
				System.out.println("Unknown Number!!");
			}
		} else {
			System.out.println("No values to print!!");
		}
	}
}