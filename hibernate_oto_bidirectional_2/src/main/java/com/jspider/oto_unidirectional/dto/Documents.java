package com.jspider.oto_unidirectional.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "User_Documents_Bi")
public class Documents {
	@Id
	@Column(name = "Documentation_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private long adharNumber;
	private String panNumber;
	private long voterID;
	@OneToOne
	//@Column(name = "User_Id")// Not Working
	User user;

}
