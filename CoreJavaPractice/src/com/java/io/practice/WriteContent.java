package com.java.io.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class WriteContent {

	public static void main(String[] args) throws IOException {

		FileOutputStream out = new FileOutputStream("myfile1.txt");
		PrintStream p = new PrintStream(out);
		p.println("This is written to a file");
		p.println("Sai Koushik");
		p.close();
		out.close();
	}

}
