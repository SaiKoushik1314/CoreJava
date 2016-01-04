package com.util.jav.practice;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		System.out.println("Enter Emp No: ");
		int sno = readInt();
		System.out.println("Enter Name: ");
		String name = readString();
		System.out.println("No: " + sno);
		System.out.println("Name: " + name);
	}

	private static String readString() {
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}

	private static int readInt() {
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}
}
