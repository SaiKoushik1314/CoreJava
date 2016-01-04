package com.java.io.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization {
	static Employee e;

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("Serialize.ser");
		ObjectInputStream ot = new ObjectInputStream(fi);
		try {
			e = (Employee) ot.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Name: " + e.getName());
		System.out.println("Salary: " + e.getSalary());
		System.out.println("Sex: " + e.getSex());
	}

}
