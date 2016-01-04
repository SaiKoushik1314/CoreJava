package BankProject;

import java.util.Scanner;

public class Cash  {
	
	double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public  void depositbalance(double deposit){
		System.out.println("Enter the value of deposit: ");
		Scanner scan1 = new Scanner(System.in);
		deposit = scan1.nextDouble();
		System.out.println("amount deposited is:"+deposit);
		
		balance = balance+deposit;
		
	}

}
