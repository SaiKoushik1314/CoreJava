package com.util.jav.practice;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array list
		ArrayList al = new ArrayList();

		// Add elements to the array list
		al.add(new Integer(1));
		al.add(new Integer(2));
		al.add(new Integer(3));
		al.add(new Integer(4));
		System.out.println("Contents of al: " + al);
		// Get array from the arraylist
		Object ia[] = al.toArray();
		int sum = 0;

		// Sum the array elements
		for (int i = 0; i < ia.length; i++) {
			sum += (Integer) ia[i];
		}
		System.out.println("Sum is: " + sum);

	}

}
