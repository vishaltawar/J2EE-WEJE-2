package com.jspider.designpattern.singletonfactory.bank;

public class Withdrow {
	Account account;
	static Withdrow withdrow;
	static long withdrowAmmount;

	public Withdrow(long withdrowAmount) {
		Withdrow.withdrowAmmount = withdrowAmount;
		}
	public Account getWithdrowAmount(long withdrowAmount) {

		System.out.println("Your Withdrow amount is = " + withdrowAmount + " Rs.");
		if (Account.accountBalance < withdrowAmount) {
			System.out.println("Sorry!! Balance Is Insufficient.");
			return account;
		}
		System.out.println("Please wait...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		Account.accountBalance -= withdrowAmount;
		System.out.println(withdrowAmount + " Rs. Withdrow Successfully ");

		return account;
	}
}
