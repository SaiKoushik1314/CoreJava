package com.java.io.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("intest.txt");
		File outputFile = new File("outtest.txt");
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		int c;
		while ((c = in.read()) != -1) {
			out.write(c);
		}
		in.close();
		out.close();
		System.out.println("The content of " + inputFile.toString() + " is copied to " + outputFile.toString()
				+ " successfully..");
	}

}
