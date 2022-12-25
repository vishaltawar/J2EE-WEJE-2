package com.jspider.designpattern.factory.fastfood;

import com.jspider.designpattern.factory.interfaces.FastFood;

public class Burger implements FastFood{

	@Override
	public void orderFood() {
		System.out.println("Burger Orderd.");
		
	}

}
