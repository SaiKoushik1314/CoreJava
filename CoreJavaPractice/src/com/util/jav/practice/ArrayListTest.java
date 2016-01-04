package com.util.jav.practice;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		// Add elements to the ArrayList
		al.add("Hello");
		al.add(new Integer(100));
		al.add(new Date());
		// Print them using a for loop.
		System.out.println("Retrieving the ArrayList elements by index:");
		for (int i = 0; i < al.size(); i++) {
			System.out.println("Element " + i + " = " + al.get(i));
		}
	}

}
