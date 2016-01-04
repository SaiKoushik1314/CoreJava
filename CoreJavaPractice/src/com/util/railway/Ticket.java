package com.util.railway;

import java.util.ArrayList;
import java.util.Scanner;

public class Ticket extends Passenger {

	private String tickket;

	public String getTickket() {
		return tickket;
	}

	public void setTickket(String tickket) {
		this.tickket = tickket;
	}

	public Ticket() {

	}

	public Ticket(String ticket) {
		super();
		this.tickket = ticket;
	}

	public static void issue() {
		System.out.println("Enter the number of persons:");
		Scanner scan = new Scanner(System.in);
		int quantity;
		quantity = scan.nextInt();
		ArrayList<Passenger> myarray = new ArrayList();
		for (int i = 0; i < quantity; i++) {

			System.out.println("Enter the passenger details:");
			//
		

			Passenger p = new Passenger();
			System.out.println("Enter the firstname:");
			p.setFirstName(scan.nextLine());
			System.out.println("Enter the lastname:");
			p.setLastName(scan.nextLine());
			System.out.println("enter the phonenumber:");
			p.setPhoneNumber(scan.nextLine());
			System.out.println("enter your email:");
			p.setEmail(scan.nextLine());
			String name = p.getFirstName() + p.getLastName();
			 myarray.add(p);
		}
                 for(Passenger passenger:myarray){
                	 System.out.println("Name:"+passenger.getFirstName()+","+passenger.getLastName());
                	 System.out.println("Phone Number:"+passenger.getPhoneNumber());
                	 System.out.println("Email address is:"+passenger.getEmail());
                	 System.out.println("----------------------------------------");
                 }
                 Scanner scan1 = new Scanner(System.in);
                 boolean choice;
                 System.out.println("Confirm your details");
     			choice = scan1.hasNext(); 
     			if (choice = "Y" != null){
     				System.out.println("Details confirmed");
     				
     			}
	}

}
