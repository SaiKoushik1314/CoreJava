package com.util.jav.practice;

public class MatchPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("Please pass the Phone Number as a program argument");
			System.exit(0);
		}
		isPhoneValid(args[0]);
	}

	private static void isPhoneValid(String phone) {
		// TODO Auto-generated method stub
		String phonePattern = "\\d-\\d{3}-\\d{3}-\\d{4}";
		boolean isMatching = phone.matches(phonePattern);
		if (isMatching) {
			System.out.println(phone + " is matching the pattern: " + phonePattern);
		} else {
			System.out.println(phone + " is NOT matching the pattern: " + phonePattern);
		}

	}

}
