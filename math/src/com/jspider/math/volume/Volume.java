package com.jspider.math.volume;

public class Volume {

	public void square(float side, float heigth) {
		System.out.println((side * side) * heigth);
	}

	public void rectangle(float length, float base, float heigth) {
		System.out.println(length * base * heigth);
	}

	public void cylinder(float redius, float heigth) {
		System.out.println(2 * 3.14 * (redius * redius) * heigth);
	}

	public void circul(float redius) {
		System.out.println((4 / 4) * 3.14 * (redius * redius * redius));
	}

//	public void sphere(int redius) {
//		System.out.println(3.14*(redius*redius));
//	}

}
