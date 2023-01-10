package com.jspider.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.springrest.Services.StudentService;
import com.jspider.springrest.pojo.StudentPojo;
import com.jspider.springrest.response.StudentResponse;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping(path = "/add", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<StudentResponse> add(@RequestBody StudentPojo student) {
		StudentPojo pojo = service.add(student);
		StudentResponse response = new StudentResponse();
		if (pojo != null) {
			response.setMsg("Ok");
			response.setDescription("Student added Successfully.");
			response.setStudent(pojo);
			return new ResponseEntity<StudentResponse>(response, HttpStatus.ACCEPTED);
		}
		response.setMsg("Fail");
		response.setDescription("Student Not Found..!!");
		return new ResponseEntity<StudentResponse>(response, HttpStatus.BAD_REQUEST);
	}

	@GetMapping(path = "/search{id}", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<StudentResponse> search(@PathVariable int id) {
		StudentPojo pojo = service.search(id);
		if (pojo != null) {
			return new ResponseEntity<StudentResponse>(new StudentResponse("OK", "Student Found", pojo, null),
					HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<StudentResponse>(new StudentResponse("Fail", "Student Not Found", pojo, null),
				HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping(path = "/delete{id}", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<StudentResponse> delete(@PathVariable int id) {
		StudentPojo pojo = service.delete(id);
		if (pojo != null) {
			return new ResponseEntity<StudentResponse>(new StudentResponse("OK", "Student Deleted", pojo, null),
					HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<StudentResponse>(new StudentResponse("Fail", "Student Not Found", pojo, null),
				HttpStatus.BAD_REQUEST);
	}

	@PutMapping(path = "/update", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<StudentResponse> update(@RequestBody StudentPojo student) {
		StudentPojo pojo = service.update(student);
		if (pojo != null) {
			return new ResponseEntity<StudentResponse>(
					new StudentResponse("OK", "Student Data Successfully Updated", pojo, null), HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<StudentResponse>(new StudentResponse("Fail", "Student Not Found", pojo, null),
				HttpStatus.BAD_REQUEST);
	}

	// Get all Student
	@GetMapping(path = "/getall", consumes = { MediaType.APPLICATION_JSON_VALUE },
								  produces = {MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<StudentResponse> getAll() {
		List<StudentPojo> students = service.getAll();
		if (students != null) {
			return new ResponseEntity<StudentResponse>(new StudentResponse("OK", "Student Found", null, students),
					HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<StudentResponse>(new StudentResponse("Fail", "Student Not Found", null, students),
				HttpStatus.BAD_REQUEST);
	}

}
