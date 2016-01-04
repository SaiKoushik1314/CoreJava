package com.java.funda;

public class StringandStringBuilder {

	public static void main(String[] args) {
		String s1 = "Sai";
		String s2 = "Koushik";
		String s3 = "Nishant";
		String s4 = "Anumolu";
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s1));
		System.out.println(s1.length());
		System.out.println(s1.substring(1));
		System.out.println(s1);
		StringBuilder stb1 = new StringBuilder("Chicago");
		stb1.append("Bears");
		System.out.println(stb1);
		stb1.append(s4);
		System.out.println(stb1);
		stb1.delete(1, 4);
		System.out.println(stb1);
		stb1.reverse();
		System.out.println(stb1);
		StringBuffer st1 = new StringBuffer("Sai");
		st1.append(s2);
		System.out.println(st1);
		System.out.println(st1.toString() + st1.length());

		Integer a = 4;
		System.out.println(a.toString());
        System.out.println(Integer.toString(44));
	}

}
