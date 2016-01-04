package com.java.io.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {

	public static void main(String[] args) throws IOException {

		Employee er = new Employee();
		er.setName("Eshwar");
		er.setSex("Male");
		er.setSalary(8978.9);
		
		FileOutputStream fos = new FileOutputStream("Serial.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(er);
		oos.close();
		fos.close();
		
	}

}
