package com.jspider.onetomany.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Entity
@Data
public class EmployeeDTO {
	@Id
	private int id;
	private String name;
	private String email;
	private double salary;
	@ManyToOne
	private CompanyDTO company;

}
