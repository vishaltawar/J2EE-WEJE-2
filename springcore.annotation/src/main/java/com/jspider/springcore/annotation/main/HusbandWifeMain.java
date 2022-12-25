package com.jspider.springcore.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.springcore.annotation.beans.HusbandBean;
import com.jspider.springcore.annotation.config.HusbandWifeConfig;

public class HusbandWifeMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HusbandWifeConfig.class);
		HusbandBean husband = (HusbandBean) context.getBean("Husband");
		System.out.println(husband);
		((AnnotationConfigApplicationContext) context).close();
	}

}
