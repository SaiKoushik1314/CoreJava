package com.util.jav.practice;

public class ForTest {

	public static void main(String[] args) {
		int i[] = { 1, 2, 3, 4, 5 };
		System.out.println("Traditional For Loop");
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		System.out.println("Enhanced For Loop");
		for (int j : i) {
			System.out.println(j);
		}

	}

}
