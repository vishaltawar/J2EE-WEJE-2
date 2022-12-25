package com.jspider.manytomany.dto;

import java.security.KeyStore.PrivateKeyEntry;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class ProductDTO {
	@Id
	private int id;
	private String name;
	private double price;
	private String catergory;

}
