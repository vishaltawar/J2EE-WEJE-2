package com.jspider.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jspider.user.payload.ApiResponce;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponce> handlerResourceNotFondException(ResourceNotFoundException ex) {
		String message = ex.getMessage();
		ApiResponce apiResponce = new ApiResponce();
		apiResponce.setMassage(message);
		apiResponce.setSuccess(true);
		apiResponce.setStatus(HttpStatus.NOT_FOUND);

		return new ResponseEntity<ApiResponce>(apiResponce, HttpStatus.NOT_FOUND);
	}

}
