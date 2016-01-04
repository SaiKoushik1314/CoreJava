package com.util.jav.practice;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		// Add elements to the ArrayList
		System.out.println("Initial size of al: " + al.size());
		// Add elements to the ArrayList
		al.add("Hello");
		al.add(new Integer(100));
		al.add(new Double(200.0));
		al.add(new Float(300.0f));
		al.add(1, "Hi");
		System.out.println("Size of al after additions: " + al.size());
		// Display the array list
		System.out.println("Contents of al: " + al);
		// Remove elements from the array list
		al.remove("Hi");
		al.remove(2);
		System.out.println("Size of al after deletions: " + al.size());
		System.out.println("Contents of al: " + al);
	}

}
