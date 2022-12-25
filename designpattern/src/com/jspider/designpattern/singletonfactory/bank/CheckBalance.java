package com.jspider.designpattern.singletonfactory.bank;

public class CheckBalance {
	Account account;

	public Account getCheckBalance() {

		System.out.println("Your Available Balance is = " + Account.accountBalance);
		return account;
	}
}
