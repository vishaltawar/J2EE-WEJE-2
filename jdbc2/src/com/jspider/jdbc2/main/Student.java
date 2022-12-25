package com.jspider.jdbc2.main;

public class Student {
	private int id;
	private String name;
	private String email;
	static int i=1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "\nStudent :- "+i++ +"\nid=" + id + ", \nname=" + name + ", \nemail=" + email;
	}

}
