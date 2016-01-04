package com.java.io.practice;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataIOTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// write the data out
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("invoice1.txt"));
		double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
		int[] units = { 12, 8, 13, 29, 50 };
		String[] descs = { "Java T-shirt", "Java Mug", "Duke Juggling Dolls", "Java Pin", "Java Key Chain" };
		for (int i = 0; i < prices.length; i++) {
			out.writeDouble(prices[i]);
			out.writeChar('\t');
			out.writeInt(units[i]);
			out.writeChar('\t');
			out.writeObject(descs[i]);
			out.writeChar('\n');
		}
		out.close();

		// read it in again
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("invoice1.txt"));
		double price;
		int unit;
		String desc;
		double total = 0.0;
		try {
			while (true) {
				price = in.readDouble();
				in.readChar(); // throws out the tab
				unit = in.readInt();
				in.readChar(); // throws out the tab
				desc = (String)in.readObject();
				in.readChar(); // throws out the tab
				System.out.println("Order of " + unit + " units of " + desc + " at $" + price);
				total = total + unit * price;
			}
		} catch (EOFException e) {
		}
		System.out.println("For a TOTAL of: $" + total);
		in.close();
	}

}
