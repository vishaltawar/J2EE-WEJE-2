package com.jspider.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcore.beans.StudentBeans;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("studentConfig.xml");
		StudentBeans studentBeans =(StudentBeans) context.getBean("Student1");
		StudentBeans studentBeans1=(StudentBeans)context.getBean("Student2");
		System.out.println(studentBeans);
		System.out.println(studentBeans1);
		((ClassPathXmlApplicationContext)context).close();
	}

}
