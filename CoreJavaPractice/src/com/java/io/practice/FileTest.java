package com.java.io.practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {

		File sourceFile = new File("source.txt");
		File destFile = new File("dest.txt");
		FileReader in = new FileReader(sourceFile);
		FileWriter out = new FileWriter(destFile);
		int c;
		while((c = in.read())!= -1){
			out.write(c);
		}in.close();
		out.close();
		System.out.println("The contents of source file:"+sourceFile.toString()+"Copied to:"+destFile.toString());
	}

}
