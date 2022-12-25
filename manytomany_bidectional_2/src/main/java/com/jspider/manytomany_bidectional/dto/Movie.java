package com.jspider.manytomany_bidectional.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Movie_Table")
public class Movie {
	@Id
	@JoinColumn(name = "movie_id")
	private int id;
	private String name;
	private double price;
	@ManyToMany(mappedBy="movies")
	List<Customer> customers;

}
