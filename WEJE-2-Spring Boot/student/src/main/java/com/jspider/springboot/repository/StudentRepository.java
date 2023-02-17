package com.jspider.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.springboot.pojo.StudentPojo;

public interface StudentRepository extends JpaRepository<StudentPojo , Integer> {
	public StudentPojo findByName(String name);

}
