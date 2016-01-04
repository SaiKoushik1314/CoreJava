package com.util.fileproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class InputFile {

	public static void main(String[] args) throws FileNotFoundException {

		File firstFile= new File("first.txt");
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the input your for file");
		String input = scan1.nextLine();
		PrintStream p= new PrintStream(firstFile);
		p.println(input);
		
	}

}
