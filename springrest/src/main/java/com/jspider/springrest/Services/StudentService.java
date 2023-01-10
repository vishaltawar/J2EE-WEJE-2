package com.jspider.springrest.Services;

import java.util.List;

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

	public StudentPojo search(int id) {
		StudentPojo pojo = repository.search(id);
		return pojo;
	}

	public StudentPojo delete(int id) {
		StudentPojo pojo = repository.delete(id);
		return pojo;
	}

	public StudentPojo update(StudentPojo student) {
		StudentPojo pojo = repository.update(student);
		return pojo;

	}

	public List<StudentPojo> getAll() {
		List<StudentPojo> students = repository.getAll();

		return students;
	}
}
