package com.util.jav.practice;

import java.util.Collections;

import java.util.Set;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String args[]) {

		String elements[] = { "Irish Coffee", "Chinese Noodles", "English Burger", "Bombay Bhelpuri", "Madras Sambar" };

		Set set = new TreeSet(Collections.reverseOrder());

		for (int i = 0, n = elements.length; i < n; i++) {

			set.add(elements[i]);

		}

		System.out.println(set);

	}

}