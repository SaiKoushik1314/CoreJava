package com.java.oop;

public class M {
	public static void main(String args[]) {
M m1 =new M();
		m1.amethod(args);

	}

	public void amethod(String[] args) {

		for (int i = 0; i < args.length; i++) {

			System.out.println(args[i]);
		}
	}

}