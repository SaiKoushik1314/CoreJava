package com.util.railway;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Payment  {
    
	static public void payment(){
		System.out.println("Swipe your card");
		System.out.println("Reading card");
		File inputFile = new File("card1.txt");
		try {
			FileReader in = new FileReader(inputFile);
			int c;
			while ((c = in.read()) != -1) {
				System.out.println((char) c);
			}
			in.close();
			System.out.println("card accepted");
			System.out.println("your ticket is sent an sms/email to you.");
			System.out.println("ThankYou");
		} catch (FileNotFoundException e) {
			System.out.println("card not found");
		} catch (IOException e) {
			System.out.println("Input output exception while reading the data");
		}
	}
	
	
	
}
