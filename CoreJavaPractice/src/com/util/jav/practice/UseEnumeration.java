package com.util.jav.practice;

import java.util.Enumeration;
import java.util.Hashtable;

class UseEnumeration {
	public static void main(String args[]) {
		Hashtable ht = new Hashtable();
		// Hashtable is used to store key-value pairs
		// this speeds up the process of searching for an element
		String s1 = new String("keyone");
		String s2 = new String("keytwo");
		String s3 = new String("keythree");
		// any java object can be used as a key,
		// but here we are using string objects
		ht.put(s1, "value one");
		ht.put(s2, "value two");
		ht.put(s3, "value three");
		// we can use any java object as value
		System.out.println(ht.get(s3));
		ht.put(s3, "new three");
		System.out.println(ht.get(s3));
		// let us use enumerator here
		Enumeration e = ht.keys();
		// returns an enumeration object which
		// can used to iterate through list.
		System.out.println(e);
		while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			System.out.println(key + "=" + ht.get(key));
		}
	}
}