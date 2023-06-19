package com.jspider.hotel.exception;

//This is user created Exception class for handled to any Resource Not Found Exception.
//while creating user define Exception class, we must be extends "RuntimeException" class.
public class ResourceNotFoundException extends RuntimeException {

	// No Aurgument contructor
	public ResourceNotFoundException() {
		super("Resource Not Found on Server.!!");
		
	}
	// Aurgument contructor
	public ResourceNotFoundException(String msg) {
		super(msg);
		
	}
	
	

}
