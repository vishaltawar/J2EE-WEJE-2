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
@Table(name = "Product_Details")
public class ProductDTO {
	@Id
	@Column(name = "ProductDTO_Id")
	private int id;
	private String name;
	private double price;
	private String catergory;
	@ManyToMany
	List<CustomerDTO> customer;

}
