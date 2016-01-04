package com.java.io.practice;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class CountLinesNWords {

public static void main(String[] args) throws IOException {

File inputFile = new File("myfile.txt"); 

FileInputStream fin = new 

FileInputStream(inputFile); 

DataInputStream in = new DataInputStream(fin);

String data;


StringTokenizer tokenizer;

int lineCounter = 0;

int wordCounter = 0;

System.out.println("Content in the file " + 

inputFile.getName() + " is as follows:");

System.out.println("---------------------------------------------------------------");

while (in.available() != 0) {

data = in.readLine();

System.out.println(data);

tokenizer = new StringTokenizer(data);

wordCounter += tokenizer.countTokens();

lineCounter += 1;

}
System.out.println();

System.out.println("No. of lines in the file: " + lineCounter);

System.out.println("No. of words in the file: " + wordCounter);

in.close(); 

}

}