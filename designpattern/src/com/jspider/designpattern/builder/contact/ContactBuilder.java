package com.jspider.designpattern.builder.contact;

public class ContactBuilder {
	private String firstName;
	private String miiddleName;
	private String lastName;
	private long mobileNo;
	private long landlineNo;
	private String email;
	private String address;
	private String company;
	private String dob;

	

	public ContactBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public ContactBuilder setMiiddleName(String miiddleName) {
		this.miiddleName = miiddleName;
		return this;
	}

	public ContactBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public ContactBuilder setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
		return this;
	}

	public ContactBuilder setLandlineNo(long landlineNo) {
		this.landlineNo = landlineNo;
		return this;
	}

	public ContactBuilder setEmail(String email) {
		this.email = email;
		return this;
	}

	public ContactBuilder setAddress(String address) {
		this.address = address;
		return this;
	}

	public ContactBuilder setCompany(String company) {
		this.company = company;
		return this;
	}

	public ContactBuilder setDob(String dob) {
		this.dob = dob;
		return this;
	}

	public Contact contact() {
		Contact contact=new Contact(this.firstName, this.miiddleName, this.lastName, this.mobileNo, this.landlineNo, this.email, this.address, this.company, this.dob);
		return contact;
	}

}
