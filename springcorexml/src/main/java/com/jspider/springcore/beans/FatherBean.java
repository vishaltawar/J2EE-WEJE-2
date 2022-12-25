package com.jspider.springcore.beans;

import java.awt.print.PrinterAbortException;
import java.util.List;

import lombok.Data;

@Data
public class FatherBean {
	private int id;
	private String name;
	private int age;
	private List<ChildBean> children;

}
