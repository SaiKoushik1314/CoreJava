package com.java.io.practice;

import java.io.File;

public class MyFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length == 0) {
			System.out.println("No program arguments");
		} else {
			File inputFile = new File(args[0]);
			System.out.println("The File Name: " + inputFile.getName());
			System.out.println("The File Path: " + inputFile.getAbsolutePath());
			System.out.println("Is Directory?: " + inputFile.isDirectory());
			if (inputFile.isDirectory()) {
				System.out.println("\nFile Contents:");
				String[] files = inputFile.list();
				for (String file : files) {
					System.out.println(file);
				} // End of for
			} // End of if
		} // End of else

	}

}
