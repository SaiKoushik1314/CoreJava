package com.util.jav.practice;

import java.util.*;

class UseVectorIter {
	public static void main(String args[]) {
		Vector v = new Vector();
		v.addElement(new String("one"));
		v.addElement(new String("two"));
		v.addElement(new String("three"));
		v.addElement(new String("four"));
		System.out.println(v);
		// let us use iterator here
		Iterator e = v.iterator();
		while (e.hasNext()) {
			String s = (String) e.next();
			System.out.println(s);
			e.remove();
		}
		System.out.println(v);
	}
}