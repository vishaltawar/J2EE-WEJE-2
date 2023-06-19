package com.jspider.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
	
	private int id;
	private int userId;
	private int hotelId;
	private String feedback;

}
