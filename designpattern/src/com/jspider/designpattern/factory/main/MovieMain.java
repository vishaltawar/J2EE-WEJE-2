package com.jspider.designpattern.factory.main;

import java.util.Scanner;

import com.jspider.designpattern.factory.interfaces.Movies;
import com.jspider.designpattern.factory.movie.KGF2;
import com.jspider.designpattern.factory.movie.Kantara;
import com.jspider.designpattern.factory.movie.Pushapa;
import com.jspider.designpattern.factory.movie.Vikram;

public class MovieMain {
	static Movies movies;
	static boolean loop=true;
	public static void main(String[] args) {
		while(loop) {
			try {
				MovieMain.getMovie().noPlaying();				
			}catch (NullPointerException e) {
				System.out.println("Movie Not available");
			}
		}
	}

	public static Movies getMovie() {
		System.out.println("Select Movie from List:\n 1. KGF Chapter 2 \n 2. Vikram \n 3. Pushapa \n 4. Kantara");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Choose :- ");
		int choise = scanner.nextInt();
		scanner.close();
		switch (choise) {
		case 1:
			movies = new KGF2();
			loop=false;
			return movies;
		case 2:
			movies = new Vikram();
			loop=false;
			return movies;
		case 3:
			movies = new Pushapa();
			loop=false;
			return movies;
		case 4:
			movies = new Kantara();
			loop=false;
			return movies;

		default:
			System.out.println("Invalid Choise..!!");
			loop=false;
			return movies;
		}
	}
}
