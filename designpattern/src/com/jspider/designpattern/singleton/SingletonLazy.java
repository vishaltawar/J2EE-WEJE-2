package com.jspider.designpattern.singleton;
// Lazy Singleton Disign Pattern;
public class SingletonLazy {
	static SingletonLazy singletonLazy;
	static int count;

	private SingletonLazy() {
		count++;
		System.out.println("Objecte created " + count + " Time");
	}

	public static SingletonLazy getSingleton() {
		if (singletonLazy == null) {
			singletonLazy = new SingletonLazy();
			return singletonLazy;
		}
		return singletonLazy;
	}

}
