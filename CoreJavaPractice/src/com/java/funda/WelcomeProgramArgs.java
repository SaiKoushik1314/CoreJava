package com.java.funda;

public class WelcomeProgramArgs {
	public static void main(String[] args) {

		System.out.println("Hello World!");

		if (args.length > 0) {

			System.out.println(args[0]);

		} else {

			System.out.println("No args!!");

		}

	}

}