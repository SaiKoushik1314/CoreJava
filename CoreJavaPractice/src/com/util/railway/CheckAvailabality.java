package com.util.railway;

import java.util.Scanner;

public class CheckAvailabality extends Ticket {
	
	
public static void main(String[] args) {
	
	CheckAvailablity();	
	Payment.payment();
		

	}

	public static void CheckAvailablity() {
		System.out.println("Hy! How are you");
		System.out.println("Please enter the train number:");
		Scanner scan1 = new Scanner(System.in);
		int train = scan1.nextInt();
		System.out.println("Enter the date:");
		scan1.next();
		System.out.println("Enter the number of passengers:");
		int count = scan1.nextInt();
		if (train == 2345 && count <= 4) {
			System.out.println("seats are avaialble");
			System.out.println("Do you wanna reserve?");
			boolean choice;
			choice = scan1.hasNext(); 
			if (choice = "Y" != null) {
                  issue();
			}
		} else {
			System.out.println("sorry!N/A");
		}

	}

}
