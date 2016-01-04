package com.java.funda;

class Strings {
	public static void main(String[] args) {

		String student1 = "Jim"; // strings are reference types with pointers
		String student2 = "Jim"; // does java need 4 different strings here?
		String student3 = "Jim";
		String teacher1 = "Jim"; // teacher of the class is named jim

		teacher1 = "Joe"; // assume the new teacher is named joe
							// string values are immutable, but the pointers can
							// change

		changeString1(teacher1); // call method to add last name johnson to joe
		System.out.println("\n String name back in main is " + teacher1);

		String newString = changeString2(teacher1); // add last name johnson to
													// joe
		System.out.println("\n String returned from changeString2 is " + newString);

		String s1 = "johnny doe"; // s1 points to string;
		String s2 = s1.substring(0, 4); // s2 is john, this is how you truncate
		String s3 = s1.toUpperCase();// JOHNNY DOE
		String s4 = s1 + " jane doe"; // john
		String s5 = s1.concat(" jane doe");//
		String s6 = s1.replace("n", "z");
		String s7 = s1.replace("doe", "smith");

		int len = s1.length(); // value is 10

		int i1 = s1.indexOf("doe", 0);
		int i2 = s1.indexOf("john", 5); // not found -1

		boolean b1 = s1.equals("joey"); // false
		boolean b2 = s1.endsWith("doe"); // true
		boolean b3 = s1.contains("doe"); // true

		String s9 = "I LIKE JAVA";
		s9 += " IT IS COOL;"; // s9 has moved pointer here to a new larger
								// string

		String name = "MIKE";

		if (name.charAt(0) == 'M') {
			System.out.println("\nfirst char is M");
		}
		// MI IS STARTING LETTERS?
		if (name.startsWith("MI")) {
			System.out.println("name starts with MI");
		}

		// Does string contain KE"?
		if (name.indexOf("KE") != -1) {
			System.out.println("it contains KE");
		}

		StringBuilder stb1 = new StringBuilder("Chicago"); // if memory is a big
															// concern
		stb1.append(" Bears"); // Bears added at end
		System.out.println(stb1);
		stb1.delete(0, 7); // delete Chicago
		System.out.println(stb1);
		stb1.insert(0, "Bad News and more bad news"); // insert Bad News in
														// front
		System.out.println(stb1);
		changeString3(stb1); // call method to change the actual string
		System.out.println(stb1);
		// String ss = (String) stb1; //can not do

	}

	// this method will attempt change the string by adding in last name to
	// first name
	static void changeString1(String inString) {
		inString = inString + " Johnson"; // recall string values are immutable
		System.out.println("String name inside changeString1 method is\n" + inString);
	}

	// this method will return a string that adds Johnson to first name
	static String changeString2(String s) {
		String returnString;
		return returnString = s + " Johnson";

	}

	// this method will physically change the string
	static void changeString3(StringBuilder sb) {
		sb.append(" --Wait till next year!!!!"); // Bears added at end
	}

}
