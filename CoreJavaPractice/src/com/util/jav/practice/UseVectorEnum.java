package com.util.jav.practice;

import java.util.*;

class UseVectorEnum {
	public static void main(String args[]) {
		Vector v = new Vector();
		v.addElement(new String("one"));
		v.addElement(new String("two"));
		v.addElement(new String("three"));
		v.addElement(new String("four"));
		// we can add any java object to vector
		// let us use enumerator here
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("-------------------");
		// let us use index of vector to read the data
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}
}