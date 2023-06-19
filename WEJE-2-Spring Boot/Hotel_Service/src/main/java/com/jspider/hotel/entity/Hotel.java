package com.jspider.hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // for setter & Getter
@NoArgsConstructor // No aurguments contructor
@AllArgsConstructor // All aurguments contructor
@Entity // this class mentioned as Entity of this Project & this annotation is responsible to create
		// table in database.
public class Hotel {

	@Id // for primary key in database table
	@GeneratedValue(strategy = GenerationType.AUTO) // for Auto generating Hotel Id
	private int id;
	private String name;
	private String location;
	private String about;

}
