package com.jspider.springcore.beans;

import lombok.Data;

@Data
public class ChildBean1 {
	private int id;
	private String name;
	private FatherBean1 father;

}
