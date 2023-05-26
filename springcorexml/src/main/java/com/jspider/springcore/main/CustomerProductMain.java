package com.jspider.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcore.beans.CustomerBean;

public class CustomerProductMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CostumerProductConfig.xml");
		CustomerBean customer1 = (CustomerBean) context.getBean("customer1");
		CustomerBean customer2 = (CustomerBean) context.getBean("customer2");
		System.out.println(customer1);
		System.out.println();
		System.out.println(customer2);

		((ClassPathXmlApplicationContext) context).close();
	}

}
