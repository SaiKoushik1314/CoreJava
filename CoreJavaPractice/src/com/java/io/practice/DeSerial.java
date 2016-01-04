package com.java.io.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial {
	static Employee e;

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("Serial.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		e = (Employee) ois.readObject();
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getSex());
	}

}
