package com.jspider.hibernate2.dto;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class WifeDTO {
	@Id
	private int id;
	private String name;
	private String email;
	private int age;
	private long contact;

}
