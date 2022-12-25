package com.jspider.designpattern.factory.fastfood;

import com.jspider.designpattern.factory.interfaces.FastFood;

public class Pasta implements FastFood {

	@Override
	public void orderFood() {
		System.out.println("Pasta Orderd.");		
	}
}
