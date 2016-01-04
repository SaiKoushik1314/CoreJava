package com.util.jav.practice;

import java.util.Scanner;

public class ScannerAddNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First No: ");
		int a = scanner.nextInt();
		System.out.println("Enter Second No: ");
		int b = scanner.nextInt();
		int sum = a + b;
		System.out.println("Sum of  " + a + " and " + b + ": " + sum);
		scanner.close();
	}
}
