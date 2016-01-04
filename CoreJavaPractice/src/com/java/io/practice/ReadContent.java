package com.java.io.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadContent {

	public static void main(String[] args) {
		File inputFile = new File("intest.txt");
		try {
			FileReader in = new FileReader(inputFile);
			int c;
			while ((c = in.read()) != -1) {
				System.out.println((char) c);
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println(inputFile.getName() + " is not available");
		} catch (IOException e) {
			System.out.println("Input output exception while reading the data");
		}

	}

}
