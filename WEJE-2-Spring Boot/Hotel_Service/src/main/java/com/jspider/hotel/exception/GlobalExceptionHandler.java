package com.jspider.hotel.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // Here we handle Globally Exception. if any where exception occurred in Project.
						
public class GlobalExceptionHandler {

	// It's we mention for which class you want to handle exception.
	// If mention class Exception will be occurred, this method will be execute auto by @RestControllerAdvice .
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<Object, Object>> resourceNotFoundException(ResourceNotFoundException ex) {
		Map<Object, Object> map = new HashMap<>();// here we used Map interface for creating meaning full response.
													// No need to create seperate class for APIResponce.
		map.put("message", ex.getMessage());
		map.put("success", false);
		map.put("status", HttpStatus.NOT_FOUND);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		// using ResponseEntity class of static methods, we directly send our Response
		// with HttpStatus.

	}

}
