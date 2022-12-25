package com.jspider.manytomany_bidectional.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Custemer_Movie")
public class Customer {

	@Id
	@Column(name = "custemer_id")
	private int id;
	private String name;
	private long contact;
	@ManyToMany
	//@JoinTable(name = "Movie_Purchased", joinColumns = @JoinColumn (referencedColumnName = "custemer_id"),inverseJoinColumns = @JoinColumn (referencedColumnName = "movie_id"))
	List<Movie> movies;

}
