package com.java.io.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization  {
	

	public static void main(String[] args) throws IOException {
		
		Employee e = new Employee();
		e.setName("Sai");
		e.setSalary(10000.4);
		e.setSex("Male");
		
		try{
			FileOutputStream se = new FileOutputStream("Serialize.ser");
			ObjectOutputStream ot = new ObjectOutputStream(se);
			ot.writeObject(e);
			ot.close();
			se.close();
			System.out.println("Serialized Data Implemneted");
			
//			FileWriter out = new FileWriter("Serialize.ser");
//			out.write(e.getName());
//            out.write(e.getSex());
		}finally{
			System.out.println("File Not Found");
		}
	}

}
