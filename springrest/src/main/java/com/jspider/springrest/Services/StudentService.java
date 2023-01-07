package com.jspider.springrest.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.springrest.pojo.StudentPojo;
import com.jspider.springrest.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired	
	StudentRepository repository;

	public StudentPojo add(StudentPojo student) {
		
		StudentPojo pojo = repository.add(student);
		return pojo;
		
	}
}
