package com.jspider.filehandling;

public abstract class MyAbstractClass {
	int a;
	int b;

	public MyAbstractClass(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	abstract public void test();

	public   void getName() {
		System.out.println("Abtract Class Contructor Value ==> a = "+this.a+ ", b= "+ this.b);
	}

}
