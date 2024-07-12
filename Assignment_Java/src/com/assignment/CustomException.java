package com.assignment;

import java.beans.ExceptionListener;
import java.util.Scanner;

/*
 * W.A.J.P. to create a custom exception if Customer withdraw amount which is greater than account balance then program will 
 show custom exception otherwise amount will deduct from account balance.
Account balance is:2000 Enter withdraw amount:2500
Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.
 */
class SwaraException extends Exception{
	double amount;
	public SwaraException(Double amount) {
		this.amount=amount;
	}
	
}

class ATM{
	double balance;
	public void deposite(double amount) {
		balance=balance+amount;
		System.out.println("Now balance is : "+balance);
	}
	
	public void withdraw(double amount) throws SwaraException {
		if (amount<=balance) {
			balance=balance-amount;
			System.out.println("Now balance is : "+balance);
		} else {
			double needs=amount-balance;
			throw new SwaraException(needs);
		}
	}
	
}
public class CustomException {
public static void main(String[] args) {
	ATM a1=new ATM();
	
	double amount;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter amount you want to deposite : ");
	amount=sc.nextDouble();
	a1.deposite(amount);
	
	System.out.println("Enter amount you want to withdraw : ");
	amount=sc.nextDouble();
	try {
		a1.withdraw(amount);
	} catch (SwaraException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.err.println("Sorry, insufficient balance, you need more "+e.amount +"Rs. To perform this transaction.");
	}
	
}
}
