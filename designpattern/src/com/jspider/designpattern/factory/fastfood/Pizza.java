package com.jspider.designpattern.factory.fastfood;

import com.jspider.designpattern.factory.interfaces.FastFood;

public class Pizza implements FastFood {

	@Override
	public void orderFood() {
		System.out.println("Pizza Orderd.");		
	}
}
