package com.jspider.serializationdesirialization.serializable;

import java.io.Serializable;

public class User implements Serializable {
	int id;
	String userName;
	String password;

	/**
	 * 
	 */
	private static final long serialVersionUID = 305597166374197534L;

	public User(int id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

	

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}

}
