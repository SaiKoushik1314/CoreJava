
package com.util.jav.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample2 {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE-MM-dd-yyyy");
		Date date = new Date();
		System.out.println("Default Date Value: " + date);
		System.out.println("Formatted Date Value: " + dateFormat.format(date));
	}
}
