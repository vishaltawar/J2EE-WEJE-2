package com.jspider.springboot.servise;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.springboot.pojo.StudentPojo;
import com.jspider.springboot.repository.StudentRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class StudentServises {
	@Autowired
	StudentRepository repository;

	// Testing Done
	public StudentPojo add(StudentPojo student) {
		System.out.println(student);
		StudentPojo pojo = repository.save(student);
		return pojo;

	}

	// StudenPojo can not be return findById()
	// findById() should return Optional
	public StudentPojo searchById(int id) {
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

	public List<StudentPojo> searchByName(String name) {
	 List<StudentPojo> students = repository.findByName(name);
	
		return students;

	}

	// Testing Done
	public List<StudentPojo> getAll() {
		List<StudentPojo> students = repository.findAll();
		
		return students;
	}

}
