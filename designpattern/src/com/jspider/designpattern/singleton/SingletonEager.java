package com.jspider.designpattern.singleton;

public class SingletonEager {

	static SingletonEager singletonEager = new SingletonEager();
	static int count;

	private SingletonEager() {
		count++;
	}

	public static SingletonEager getSingletonEager() {

		System.out.println("Objecte created " + count + " Time");
		return singletonEager;
	}

}
