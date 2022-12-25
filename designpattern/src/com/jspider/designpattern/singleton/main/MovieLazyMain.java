package com.jspider.designpattern.singleton.main;

import com.jspider.designpattern.singleton.MovieLazy;

public class MovieLazyMain {

	public static void main(String[] args) {
		MovieLazy.bookTicket(50);
		System.out.println();
		MovieLazy.bookTicket(30);
		System.out.println();
		MovieLazy.bookTicket(40);
		System.out.println();
		MovieLazy.bookTicket(90);

	}

}
