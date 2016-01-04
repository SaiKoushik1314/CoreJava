package com.java.io.practice;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class FileInputTest {

	public static void main(String[] args) {
		if (args.length == 1) {
			try {
				// Open the file that is the first
				// program argument
				FileInputStream fstream = new FileInputStream(args[0]);
				// Convert our input stream to a
				// DataInputStream
				DataInputStream in = new DataInputStream(fstream);

				// Continue to read lines while
				// there are still some left to read
				while (in.available() != 0) {
					// Print file line to screen
					System.out.println(in.readLine());
				}
				in.close();
			} catch (Exception e) {
				System.err.println("File input error: " + e.getMessage());
			}
		} // End of if
		else {
			System.out.println("Invalid parameters");
		} // End of else
	}

}
