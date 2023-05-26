package com.jspider.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspider.springboot.pojo.StudentPojo;

@Repository
public interface StudentRepository extends JpaRepository<StudentPojo , Integer> {
	public List<StudentPojo> findByName(String name);

}
