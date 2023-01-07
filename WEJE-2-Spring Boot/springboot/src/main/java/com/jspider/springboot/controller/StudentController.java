package com.jspider.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspider.springboot.pojo.StudentPojo;
import com.jspider.springboot.response.StudentResponse;
import com.jspider.springboot.servise.StudentServises;

@Controller
public class StudentController {

	@Autowired
	StudentServises servises;

	// Add Student
	@PostMapping("/add")
	public ResponseEntity<StudentResponse> add(@RequestBody StudentPojo student) {
		StudentPojo pojo = servises.add(student);
		StudentResponse response = new StudentResponse();
		if (pojo != null) {
			response.setMsg("OK");
			response.setDescription("Student Inserted Successfully");
			response.setStudent(pojo);
			return new ResponseEntity<StudentResponse>(response, HttpStatus.FOUND);
		}
		response.setMsg("FAIL");
		response.setDescription("Student Not Inserted...!!");
		response.setStudent(null);
		return new ResponseEntity<StudentResponse>(response, HttpStatus.BAD_REQUEST);
	}

	// Search By Id
	@GetMapping("/search{id}")
	public ResponseEntity<StudentResponse> search(@PathVariable int id) {
		StudentPojo student = servises.search(id);
		if (student != null) {
			return new ResponseEntity<StudentResponse>(new StudentResponse("ok", "Successfully Found", student, null),
					HttpStatus.FOUND);
		}
		return new ResponseEntity<StudentResponse>(new StudentResponse("Fail", "Not Found", student, null),
				HttpStatus.BAD_REQUEST);

	}

	// Searh By Name
	@GetMapping("/searchByName")
	public ResponseEntity<StudentResponse> searchByName(@RequestParam String name) {

		StudentPojo students = servises.searchByName(name);
		if (students != null) {
			return new ResponseEntity<StudentResponse>(
					new StudentResponse("OK", "Successfully Search All Student's", students, null),
					HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<StudentResponse>(new StudentResponse("Fail", "Sorry Data Not Found", students, null),
				HttpStatus.BAD_REQUEST);
	}

	// Delete By Id
	@DeleteMapping("/delete{id}")
	public ResponseEntity<StudentResponse> delete(@PathVariable int id) {
		StudentPojo student = servises.delete(id);
		if (student != null) {
			return new ResponseEntity<StudentResponse>(new StudentResponse("Ok", "Successfully Deleted", student, null),
					HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<StudentResponse>(new StudentResponse("Fail", "Not Deleted", student, null),
				HttpStatus.BAD_REQUEST);

	}

	@PutMapping("/update")
	public ResponseEntity<StudentResponse> update(@RequestBody StudentPojo student) {

		StudentPojo updatedStudent = servises.update(student);
		if (updatedStudent != null) {
			return new ResponseEntity<StudentResponse>(
					new StudentResponse("Ok", "Successfully Updated", updatedStudent, null), HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<StudentResponse>(new StudentResponse("Fail", "Not Updated", updatedStudent, null),
				HttpStatus.BAD_REQUEST);

	}

}
