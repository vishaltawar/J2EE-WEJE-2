package com.jspider.designpattern.singleton;

public class MovieEager {

	static MovieEager movieEager = new MovieEager(150);
	static int noOfTicket;

	private MovieEager(int noOfTicket) {
		super();
		MovieEager.noOfTicket = noOfTicket;
	}

	public static MovieEager bookTicket(int bookingTicktet) {
		System.out.println("Availble Ticket = " + MovieEager.noOfTicket);
		System.out.println("You Requested for " + bookingTicktet + " ticket");

		if (noOfTicket < bookingTicktet) {
			System.out.println(bookingTicktet + " Ticket is Currently Not Availble, Come Tomorrow");
			return movieEager;
		}
		System.out.println("Your " + bookingTicktet + " Ticket is Booking Done, Thank You Visite again.");
		noOfTicket -= bookingTicktet;
		System.out.println("Now Availble Ticket = " + MovieEager.noOfTicket);
		return movieEager;
	}

}
