package com.jspider.designpattern.singleton;

public class MovieLazy {

	static MovieLazy movieLazy;
	static int noOfTicket;

	private MovieLazy(int noOfTicket) {
		super();
		MovieLazy.noOfTicket = noOfTicket;
	}

	public static MovieLazy bookTicket(int bookingTicktet) {
		if (movieLazy == null) {
			movieLazy=new MovieLazy(200);
		}
		System.out.println("Availble Ticket = " + MovieLazy.noOfTicket);
		System.out.println("You Requested for " + bookingTicktet + " ticket");

		if (noOfTicket < bookingTicktet) {
			System.out.println(bookingTicktet + " Ticket is Currently Not Availble, Come Tomorrow");
			return movieLazy;
		}
		System.out.println("Your " + bookingTicktet + " Ticket is Booking Done, Thank You Visite again.");
		noOfTicket -= bookingTicktet;
		System.out.println("Now Availble Ticket = " + MovieLazy.noOfTicket);
		return movieLazy;
	}

}
