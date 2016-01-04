package BankProject;

import java.util.Scanner;

public class Customer extends Cash implements AccountNumber {

	 private String Firstname, Lastname, email;

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void Customer() {

		System.out.println("FirstName of person is:" + Firstname + ", " + Lastname + ": " + balance);

	}

	@Override
	public double accountnumber(double account) {
		return account;
   
	}
	
//	public void search(){
//		Scanner scan1 = new Scanner(System.in);
//		double choice1;
//		choice1 = scan1.nextDouble();
//		if(choice1=this.accountnumber(account)){
//			
//		}
//		
//	}
		
	
	
	public void askcustomer(){
		boolean choice;
		System.out.println("Do you want to deposit");
		System.out.println("Enter your choice: Y/N");
		Scanner scan1 = new Scanner(System.in);
		choice = scan1.hasNextBoolean();
		if(choice="Y" != null){
			depositbalance();
			
		}
		
	}

	public void depositbalance() {
		double deposit;
		System.out.println("Enter the value of deposit: ");
		Scanner scan1 = new Scanner(System.in);
		deposit = scan1.nextDouble();
		System.out.println("amount deposited is:" + deposit);

		balance = balance + deposit;
	}

	public void deduce() {
		double check;
		System.out.println("Enter the value of deposit: ");
		Scanner scan1 = new Scanner(System.in);
		check = scan1.nextDouble();
		System.out.println("amount deposited is:" + check);
		
		balance = balance-check;

	}

	

}
