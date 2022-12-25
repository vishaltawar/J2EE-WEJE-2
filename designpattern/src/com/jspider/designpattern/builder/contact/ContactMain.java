package com.jspider.designpattern.builder.contact;

public class ContactMain {
	public static void main(String[] args) {
		Contact contact=new ContactBuilder().setFirstName("Vishal").setLastName("Tawar").setMobileNo(7507047351L).contact();
		System.out.println(contact);
	}
}
