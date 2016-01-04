package com.util.jav.practice;

public class ArrayIterator {
	public static void main(String[] args) {
		System.out.print("args and args lengths are { ");
		for (String arg : args) {
			System.out.print(arg + "[" + arg.length() + "]; ");
		}
		System.out.println(" }.");
	}
}
