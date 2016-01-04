package Student;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class List {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		for (int i = 0; i < 10; i++) {
			al.add(i);

		}

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Object data = itr.next();
			System.out.println(data);
		}

		LinkedList<String> li = new LinkedList<String>();
		// int [] myarray ={1,2,3,4,5,7};
		String[] myarray2 = new String[4];
		// double[] myList = new double[10];
		li.addAll(al);

		System.out.println(li);

		ListIterator itr2 = li.listIterator();
		while (itr2.hasPrevious()) {
			Object data2 = itr2.next();
			System.out.println(data2);
		}
		HashMap h1 = new HashMap();
		h1.put(1, new Double(12.0));
		h1.put(2, new Integer(4));
		Map m0 = new HashMap();
		m0.put(1, li);
		Map m = new TreeMap();
		m.putAll(m0);
		System.out.println(m0);
		System.out.println(m);
		// HashTable
		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		ht1.put(100, "Sai");
		ht1.put(2, "koushik");
		ht1.put(103, "ch");
		System.out.println(ht1);

		Vector v1 = new Vector();
		v1.add(al);
		System.out.println(v1);

	}

}
