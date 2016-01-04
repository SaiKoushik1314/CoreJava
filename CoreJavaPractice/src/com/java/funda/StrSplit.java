package com.java.funda;

class StrSplit {

	public static void main(String[] args) {

		String[] result = "this,is,a test".split(",");

		for (String s : result) {

			System.out.println(s);

		}

	}

}