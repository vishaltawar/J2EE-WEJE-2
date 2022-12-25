package com.jspider.designpattern.builder.laptop;

public class LaptopBuilder {
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

	public LaptopBuilder brand(String brand) {
		this.brand = brand;
		return this;
	}

	public LaptopBuilder moddel(String moddel) {
		this.moddel = moddel;
		return this;
	}

	public LaptopBuilder color(String color) {
		this.color = color;
		return this;
	}
	

	public LaptopBuilder cpu(String cpu) {
		this.brand = cpu;
		return this;
	}
	public LaptopBuilder price(long price) {
		this.price = price;
		return this;
	}

	public LaptopBuilder ram(int ram) {
		this.ram = ram;
		return this;
	}

	public LaptopBuilder storage(int storage) {
		this.storage = storage;
		return this;
	}

	public LaptopBuilder genration(int genration) {
		this.genration = genration;
		return this;
	}

	public LaptopBuilder battery(int battery) {
		this.battery = battery;
		return this;
	}

	public LaptopBuilder screen_Size(float screen_Size) {
		this.screen_Size = screen_Size;
		return this;
	}

	public LaptopBuilder weight(float weight) {
		this.weight = weight;
		return this;
	}
	public Laptop getLaptop() {
		Laptop laptop=new Laptop(this.brand, this.moddel, this.color, this.price, this.ram, this.storage, this.cpu, this.screen_Size, this.genration, this.battery, this.weight);
		return laptop;
	}
}
