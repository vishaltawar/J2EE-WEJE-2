package com.jspider.designpattern.singletonfactory.bank;
public class Deposite {
	Account account;
	long depositeAmount;

	public Deposite(long depositeAmount) {
		this.depositeAmount = depositeAmount;
	}

	public Account getDepositeAmount(long depositeAmount) {
		System.out.println("Your Deposite amount is = " + depositeAmount + " Rs.");
		Account.accountBalance += depositeAmount;
		System.out.println(depositeAmount + " Rs. Successfullly Deposite ");
		return account;
		}
}
