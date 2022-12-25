package com.jspider.designpattern.factory.movie;

import com.jspider.designpattern.factory.interfaces.Movies;

public class Pushapa implements Movies {

	@Override
	public void noPlaying() {
		System.out.println("Now Playing Pushapa");		
	}

}
