package com.java.io.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaveData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		File file = new File("savedata.txt");
		FileWriter out = new FileWriter(file);
		BufferedWriter writer = new BufferedWriter(out);
		System.out.print("Enter your data to save (X - Exit): \n");
		String data = reader.readLine();
		while (data.equalsIgnoreCase("X") == false) {
			writer.write(data);
			writer.newLine();
			data = reader.readLine();
		}
		System.out.println("Data Saved into " + file.getName() + " successfully..");
		writer.close();
		out.close();
		reader.close();
		in.close();
	}

}
