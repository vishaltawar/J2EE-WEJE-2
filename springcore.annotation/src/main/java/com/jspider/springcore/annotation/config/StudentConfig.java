package com.jspider.springcore.annotation.config;

import org.springframework.context.annotation.Bean;

import com.jspider.springcore.annotation.beans.StudentBean;

public class StudentConfig {
	@Bean("Student1")
	public StudentBean getStudentBean() {
		StudentBean student = new StudentBean();
		student.setId(1);
		student.setName("Vishal");
		student.setEmail("vishalmtawar0202@gmail.com");
		student.setContact(8978456897L);
		return student;
	}

}
