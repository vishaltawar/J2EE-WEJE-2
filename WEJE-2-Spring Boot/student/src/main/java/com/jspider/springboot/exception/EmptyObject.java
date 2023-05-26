package com.jspider.springboot.exception;

public class EmptyObject extends RuntimeException {
	private String massage;

	public EmptyObject(String massage) {
		super(massage);
		this.massage = massage;
	}
	public EmptyObject() {
		super();		
	}
	
	
	
	
	
	

}
