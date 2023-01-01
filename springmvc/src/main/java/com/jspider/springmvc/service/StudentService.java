package com.jspider.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.springmvc.pojo.StudentPojo;
import com.jspider.springmvc.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repository;

	public StudentPojo login(String username, String password) {
		StudentPojo pojo = repository.login(username, password);
		return pojo;
	}

	public StudentPojo addStudent(String name, String email, long mobile, String city, String username, String password) {
		StudentPojo pojo = repository.addStudent(name, email,  mobile, city, username, password);
		return pojo;

	}

	public StudentPojo search(int id) {

		StudentPojo pojo = repository.search(id);
		return pojo;
	}

	public List<StudentPojo> searchAll() {
		List<StudentPojo> pojos = repository.searchAll();
		return pojos;

	}

	public StudentPojo removeStudent(int id) {
		StudentPojo pojo = repository.removeStudent(id);
		return pojo;
	}

	

	public StudentPojo updateDeatails(int id, String name, String email, long mobile, String city, String username, String password) {
		StudentPojo pojo = repository.updateDeatails(id, name, email, mobile, city, username, password);
		return pojo;

	}

}
