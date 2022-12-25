package com.jspider.onetomay.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
//@Table(name = "Mobile_Details")
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String madeIn;	
	@OneToMany
	private List<Mobile_Brand> brands;
	

}
