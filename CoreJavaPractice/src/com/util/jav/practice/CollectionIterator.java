package com.util.jav.practice;

import java.util.LinkedList;

public class CollectionIterator {
	private static LinkedList list = new LinkedList();

	public static void main(String[] args) {
		list.add(new Integer(19));
		list.add(new Double(20.0));
		list.add(new String("string"));
		for (Object o : list) {
			System.out.println(o);
		}
	}
}
