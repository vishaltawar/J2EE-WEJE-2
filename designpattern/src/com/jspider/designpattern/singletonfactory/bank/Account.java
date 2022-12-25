package com.jspider.designpattern.singletonfactory.bank;

public class Account {
	static Account account = new Account(10000);
	static long accountBalance;

	private Account(long accountBalance) {
		Account.accountBalance = accountBalance;
	}
	public Account getAccount() {
		return account;
	}
}