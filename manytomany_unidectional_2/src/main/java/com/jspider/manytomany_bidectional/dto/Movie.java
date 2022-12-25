package com.jspider.manytomany_bidectional.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Movie_Table_M_M_U")
public class Movie {
	@Id
	@JoinColumn(name = "movie_id")
	private int id;
	private String name;
	private double price;
	@ManyToMany
	@Column(name = "Movie_Customer")
	List<Customer> customers;

}
