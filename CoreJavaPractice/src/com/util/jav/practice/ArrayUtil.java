package com.util.jav.practice;

public class ArrayUtil {

	public static void main(String[] args) {
		String array[] = { "Amzad", "Arshad", "Afsar", "Basha" };
		print(array);
		Double dArray[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		print(dArray);
		Integer iArray[] = { 100, 200, 300, 400 };
		print(iArray);

	}

	public static <E> void print(E[] array) {
		for (E element : array) {
			System.out.println(element);
		}
	}

	// private static void print(Integer[] iArray) {
	// // TODO Auto-generated method stub
	// for (Integer i : iArray) {
	// System.out.println(i);
	// }
	// }
	//
	// private static void print(Double[] dArray) {
	// // TODO Auto-generated method stub
	// for (Double d : dArray) {
	// System.out.println(d);
	// }
	// }
	//
	// private static void print(String[] array) {
	// for (String s : array) {
	// System.out.println(s);
	// }
	// }

}
