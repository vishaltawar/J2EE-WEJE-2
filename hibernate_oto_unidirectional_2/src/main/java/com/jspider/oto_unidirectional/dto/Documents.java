package com.jspider.oto_unidirectional.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "User_Documents")
public class Documents {
	@Id
	@Column(name = "Documentation_Id")
	private int id;	
	private long adharNumber;
	private String panNumber;	
	private long voterID;
	

}
