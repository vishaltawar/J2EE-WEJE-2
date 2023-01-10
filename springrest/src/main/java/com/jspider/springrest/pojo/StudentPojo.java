package com.jspider.springrest.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "StudentRest")
public class StudentPojo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String  name;
	private String email;
	private long contact;
	private String address;
	private String username;
	private String password;	

}
