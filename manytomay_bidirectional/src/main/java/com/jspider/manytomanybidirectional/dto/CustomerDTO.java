package com.jspider.manytomanybidirectional.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Customer_Details")
public class CustomerDTO {

	@Id
	@Column(name = "Customer_Id")
	private int id;
	private String name;
	private String email;
	private long contact;
	@ManyToMany(mappedBy ="customer")
	List<ProductDTO> product;
	
}
