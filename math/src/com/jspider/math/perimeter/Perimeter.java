package com.jspider.math.perimeter;

public class Perimeter {

	public void square(float side) {
		System.out.println(4 * side);
	}

	public void rectangle(float length, float width) {
		System.out.println(2*(length+width));
	}

	public void cylinder(float redius,float heigth) {
		System.out.println(2*(2*redius+heigth));
	}

	public void circul(float redius) {
		System.out.println(2 * 3.14 * redius);
	}

}
