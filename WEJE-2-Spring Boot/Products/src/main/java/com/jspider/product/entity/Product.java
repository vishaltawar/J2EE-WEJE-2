package com.jspider.product.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Product Details")
public class Product {
	@Id
	@Column(name = "Product Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "Product Name")
	private String name;
	
	@Column(name = "Product price")
	private double price;
	
	@Column(name = "Brand Name")
	private String brand;
	
	@Column(name = "Color")
	private String color;
	
	@Column(name = "Weigth")
	private float weigth;
	
	@Column(name = "Manufacture  Date")
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date date;

}
