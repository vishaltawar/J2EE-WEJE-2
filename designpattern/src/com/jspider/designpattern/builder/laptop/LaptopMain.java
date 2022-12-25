package com.jspider.designpattern.builder.laptop;

public class LaptopMain {
public static void main(String[] args) {
	Laptop laptop= new LaptopBuilder().brand("Acer").moddel("Aspire 5").color("Black").price(50000).ram(8).storage(512).cpu("i5").screen_Size(16.5F).genration(11).battery(5000).weight(2.5F).getLaptop();
	System.out.println(laptop);
	System.out.println();
//	Laptop laptop1= new LaptopBuilder().brand("HP").cpu("i5").genration(10).battery(5000).weight(2.5F).getLaptop();
//	System.out.println(laptop1);
}
}
