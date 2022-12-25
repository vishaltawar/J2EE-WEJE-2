package com.jspider.filehandling;

public class AbstractMainClass {

	public static void main(String[] args) {
		MyAbstractClass myAbstractClass = new MyAbstractClass(5, 6) {

			@Override
			public void test() {
				System.out.println("OBJ creation is success");

			}
		};

		myAbstractClass.getName();
		myAbstractClass.test();
	}

}