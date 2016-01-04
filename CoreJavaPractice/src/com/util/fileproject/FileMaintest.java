package com.util.fileproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileMaintest {

	public static void main(String[] args) throws IOException {

		System.out.println("1.Write to file:");
		System.out.println("2.Edit a file");
		System.out.println("3.Read the file");
		System.out.println("4.Copy the contents");
		Scanner scan1 = new Scanner(System.in);
		int choice = scan1.nextInt();
		if (choice==1){
			writeFile();
		}
		else if (choice==2){
			editFile();
			
		}
		else if (choice==3){
			readFile();
			
		}else if (choice==4){
			copyFile();
			
		}
	}

	private static void copyFile() {
		
	}

	private static void readFile() {
		
	}

	private static void editFile() {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the name of file you want to edit:");
		String filename = scan1.nextLine();
		
		
	}

	private static void writeFile() throws IOException {
		File firstFile= new File("one.txt");
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the input your for file");
		String input = scan1.nextLine();
		PrintStream p= new PrintStream(firstFile);
		p.println(input);
	}

}
