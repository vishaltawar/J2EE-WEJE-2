package com.jspider.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcore.beans.ChildBean1;

public class ChildFatherMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ChildFatherConfig.xml");
		ChildBean1 child1 = (ChildBean1) context.getBean("child1");
		System.out.println(child1);

		ChildBean1 child2 = (ChildBean1) context.getBean("child2");
		System.out.println(child2);

		((ClassPathXmlApplicationContext) context).close();

	}

}
