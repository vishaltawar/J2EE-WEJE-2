package com.jspider.oto_unidirectional.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "User_Details")
public class User {
	@Id
	private int id;
	private String name;
	private String email;
	private long contact;
	@OneToOne
	
	Documents documents;
	
}
