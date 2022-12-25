package com.jspider.springcore.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.springcore.annotation.beans.StudentBean2;
import com.jspider.springcore.annotation.config.Student2Config;

public class Student2Main {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Student2Config.class);
		StudentBean2 student = context.getBean(StudentBean2.class);
		System.out.println(student);
		((AnnotationConfigApplicationContext)context).close();
	}

}
