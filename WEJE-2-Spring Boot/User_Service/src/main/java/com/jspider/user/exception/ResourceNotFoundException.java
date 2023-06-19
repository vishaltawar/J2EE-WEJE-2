package com.jspider.user.exception;

public class ResourceNotFoundException extends RuntimeException {

	
	public ResourceNotFoundException() {
		super("Resource Not Found on server !!");
		
	}
	
	public ResourceNotFoundException(String msg) {
		super(msg);
		
	}
	

}
