package com.jspider.designpattern.singleton.main;

import com.jspider.designpattern.singleton.MovieEager;

public class MovieEagerMain {

	public static void main(String[] args) {
		MovieEager.bookTicket(50);
		MovieEager.bookTicket(25);
		MovieEager.bookTicket(40);

	}

}
