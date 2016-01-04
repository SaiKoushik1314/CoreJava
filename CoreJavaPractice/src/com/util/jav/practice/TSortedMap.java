package com.util.jav.practice;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TSortedMap {
	public static void main(String[] args) {
		Map m = new TreeMap();
		m.put("Basha", new Integer(101));
		m.put("Zen", new Integer(102));
		m.put("Madhav", new Integer(110));
		m.put("Arun", new Integer(107));
		m.put("Peter", new Integer(104));
		m.put("Madhavan", new Double(104.88));
		System.out.println(m.get("Madhavan"));
		Iterator i = m.keySet().iterator();
		while (i.hasNext()) {
			String key = (String) i.next();
			System.out.println(key + "=" + m.get(key));
		}
	}
}