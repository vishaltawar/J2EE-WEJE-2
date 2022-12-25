package com.jspider.springcore.annotation.config;

import org.springframework.context.annotation.Bean;

import com.jspider.springcore.annotation.beans.StudentBean2;

public class Student2Config {

	@Bean
	public StudentBean2 getStudentBean2() {
		return new StudentBean2();
	}
}
