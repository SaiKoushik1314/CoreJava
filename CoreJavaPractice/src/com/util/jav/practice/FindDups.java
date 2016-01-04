package com.util.jav.practice;

import java.util.HashSet;

import java.util.Set;

public class FindDups {

	public static void main(String args[]) {

		Set s = new HashSet();

		String[] values = new String[] { "java", "java", "java2j", "javaj", "java2"};

		for (int i = 0; i < values.length; i++) {

			if (!s.add(values[i])) {

				System.out.println("Duplicate detected: " + values[i]);

			}

		}

		System.out.println("Distinct words detected: " + s);

		System.out.println("Size of HashSet: " + s.size());

	}

}