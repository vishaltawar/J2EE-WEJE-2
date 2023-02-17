package com.jspider.springboot.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jspider.springboot.pojo.StudentPojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentResponse {
	private String msg;
	private String description;
	private StudentPojo student;
	private List<StudentPojo> students;

}
