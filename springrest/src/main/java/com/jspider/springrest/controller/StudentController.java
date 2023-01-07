package com.jspider.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.springrest.Services.StudentService;
import com.jspider.springrest.pojo.StudentPojo;
import com.jspider.springrest.response.StudentResponse;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;

	@PostMapping(path = "/add", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {MediaType.APPLICATION_JSON_VALUE })
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

}
