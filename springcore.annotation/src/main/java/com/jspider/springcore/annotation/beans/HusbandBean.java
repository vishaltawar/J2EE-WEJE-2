package com.jspider.springcore.annotation.beans;

import lombok.Data;

@Data
public class HusbandBean {
	private int id;
	private String name;
	private int age;
	WifeBean wife;

}
