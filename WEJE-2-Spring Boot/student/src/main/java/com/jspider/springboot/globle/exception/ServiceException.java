package com.jspider.springboot.globle.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.jspider.springboot.exception.EmptyObject;
import com.jspider.springboot.response.StudentResponse;
@ControllerAdvice
public class ServiceException extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = EmptyObject.class)
	public ResponseEntity<StudentResponse> emptyField(){
		return new ResponseEntity<StudentResponse>(new StudentResponse("Object is Empty", "Please pass values of Student object", null, null),HttpStatus.BAD_REQUEST);
	}

}
