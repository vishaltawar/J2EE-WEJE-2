package com.jspider.springboot.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.springboot.pojo.StudentPojo;
import com.jspider.springboot.repository.StudentRepository;

@Service
public class StudentServises {
	@Autowired
	StudentRepository repository;

	public StudentPojo add(StudentPojo student) {
		StudentPojo pojo = repository.save(student);
		return pojo;

	}

	public StudentPojo search(int id) {
		StudentPojo student = repository.findById(id).orElse(null);
		// System.out.println(student);
		return student;

	}

	public StudentPojo delete(int id) {
		StudentPojo pojo = repository.findById(id).orElse(null);
		if (pojo != null) {
			repository.delete(pojo);
			return pojo;
		}
		return pojo;

	}

	public StudentPojo update(StudentPojo student) {

		int id = student.getId();
		StudentPojo updateStudent = repository.findById(id).orElse(null);
		updateStudent.setName(student.getName());
		updateStudent.setEmail(student.getEmail());
		updateStudent.setContact(student.getContact());
		updateStudent.setCity(student.getCity());
		StudentPojo studentPojo = repository.save(updateStudent);
		return studentPojo;
	}

	public StudentPojo searchByName(String name) {
		StudentPojo students = repository.findByName(name);		
		return students;

	}

}
