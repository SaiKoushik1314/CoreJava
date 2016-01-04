package com.util.jav.practice;

import java.util.HashSet;

import java.util.Iterator;

class HashSetIteratorTest {

	public static void main(String[] args) {

		HashSet set = new HashSet();

		for (int i = 0; i <= 10; i++) {
			set.add(new Integer(i % 5));
		}
		System.out.println("HashSet: " + set);

		Iterator itr = set.iterator();

		int sum = 0;

		while (itr.hasNext()) {

			sum += (Integer) itr.next();
			
		}
		System.out.println("Sum of above elements: " + sum);

	}
}