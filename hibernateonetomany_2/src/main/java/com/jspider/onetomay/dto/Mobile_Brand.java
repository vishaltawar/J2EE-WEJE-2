package com.jspider.onetomay.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
//@Table(name = "Brands")
public class Mobile_Brand {
	@Id
	private int id;
	private String modelName;
	private double price;

}
