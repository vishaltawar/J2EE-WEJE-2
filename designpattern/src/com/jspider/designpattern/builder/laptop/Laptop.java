package com.jspider.designpattern.builder.laptop;

public class Laptop {
	private String brand;
	private String moddel;
	private String color;
	private String cpu;
	private long price;
	private int ram;
	private int storage;
	private int genration;
	private int battery;
	private float screen_Size;
	private float weight;

	public Laptop(String brand, String moddel, String color, long price, int ram, int storage, String cpu,
			float screen_Size, int genration, int battery, float weight) {
		super();
		this.brand = brand;
		this.moddel = moddel;
		this.color = color;
		this.price = price;
		this.ram = ram;
		this.storage = storage;
		this.cpu = cpu;
		this.screen_Size = screen_Size;
		this.genration = genration;
		this.battery = battery;
		this.weight = weight;
	}

	

	@Override
	public String toString() {
		return "Laptop :- \nBrand = " + brand + ", \nModdel = " + moddel + ", \nColor = " + color + ", \nPrice = " + price + ", \nRam = "
				+ ram + ", \nStorage = " + storage + ", \nCPU = " + cpu + ", \nScreen Size = " + screen_Size + ", \nGenration = "
				+ genration + ", \nBattery = " + battery + ", \nWeight=" + weight + "";
	}
	
	

}
