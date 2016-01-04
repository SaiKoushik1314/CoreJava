package com.java.funda;

class ArrayTest {

	public static void main(String[] args) {
		String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun",

				"Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		System.out.println("Size of months array: " + months.length);

		// use the length attribute to get the number

		// of elements in an array

		for (int i = 0; i < months.length; i++) {

			System.out.println(months[i]);

		}System.out.println();
		for (String month : months) {

			System.out.println(month);

		}

		double numbers[] = {1,2,3.0,4,0};
		for(int i=0; i<numbers.length;i++){
			System.out.println("Number of occurence: "+i+ " Number is: " +numbers[i]);
		}
	}

}