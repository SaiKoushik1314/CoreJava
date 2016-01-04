package BankProject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BankAccount {

	double number;
	
	public BankAccount(){
		
	}

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.setFirstname("sai");

//		c1.Firstname = "sai";
//		c1.Lastname = "chituluri";
//		c1.email = "sai.koushik1314@gmail.com";
//		c1.balance = 10000.89;
//		c1.accountnumber(98889792);
		
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		Customer c4 = new Customer();
		

//		c2.Firstname = "gnanasunder";
//		c2.Lastname = "madi";
//		c2.email = "iam.madi@yahoo.com";
//		c2.balance = 9000;
//		c2.accountnumber(98889792);

//		c3.Firstname = "divya";
//		c3.Lastname = "satish";
//		c3.email = "iam.mental@gmail.com";
//		c3.balance = 9080999.9;
//		c3.accountnumber(988898792);

//		c4.Firstname = "satya";
//		c4.Lastname = "sirarsani";
//		c4.email = "iam.koushiksgod@gmai.com";
//		c4.balance = 98899.98;
//		c4.accountnumber(988898892);

		c1.Customer();
		c2.Customer();
		c3.Customer();
		c4.Customer();

		ArrayList<Customer> accounts = new ArrayList();
		accounts.add(c1);
		accounts.add(c2);
		accounts.add(c3);
		accounts.add(c4);
		
//		for (Customer customer : accounts){
//			System.out.println(customer.Firstname);
//		}

//		for (int i = 0; i < accounts.size(); i++) {
//			System.out.println(accounts.get(i));
//
//		}

	}
	

}
