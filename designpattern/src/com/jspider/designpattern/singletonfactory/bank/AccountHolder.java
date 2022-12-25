package com.jspider.designpattern.singletonfactory.bank;
import java.util.Scanner;
public class AccountHolder {
	Account account;
	static boolean loop = true;
	public static void main(String[] args) {
		while (loop) {
			transation();
			System.out.println();
		}
	}
	public static void transation() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select Transaction :-  \n 1 : Deposite\n 2 : Withdrow\n 3 : Check Balance\n 4 : Exist");
		System.out.print("Choose Option :- ");
		int choise = scanner.nextInt();
		switch (choise) {
		case 1:
			System.out.print("Enter Deposite Amount : ");
			long deposite = scanner.nextLong(); //Deposite, Amount will add in Account Balance .
			new Deposite(deposite).getDepositeAmount(deposite);
			break;

		case 2:
			System.out.print("Enter Withdrow Amount : ");
			long withdrow = scanner.nextLong(); //Withdrow, Reduce Amount from in Account Balance .
			new Withdrow(withdrow).getWithdrowAmount(Withdrow.withdrowAmmount);
			break;

		case 3:
			new CheckBalance().getCheckBalance(); // See Available Balance from Account
			break;

		case 4:
			loop = false; // For Exist Perpose
			System.out.println("Thank You.");
			break;
			
		default:
			System.out.println(" Invalid Choise !!\n Please Choose Valid Option.");
			break;
		}
		//scanner.close();
	}
}
