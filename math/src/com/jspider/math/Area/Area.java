package com.jspider.math.Area;

public class Area {
	
	public void square(float side) {
		System.out.println(side*side);
	}

	public void rectangle(float length, float base) {
		System.out.println(length*base);
	}
	
	public void cylinder(float redius, float heigth) {
		System.out.println(2*3.14*redius*heigth);
	}
	
	public void circul(float redius) {
		System.out.println(3.14*(redius*redius));
	}
	
	public void sphere(float redius) {
		System.out.println(4*3.14*(redius*redius));
	}
}
