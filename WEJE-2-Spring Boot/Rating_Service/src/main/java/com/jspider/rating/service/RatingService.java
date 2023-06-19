package com.jspider.rating.service;

import java.util.List;

import com.jspider.rating.entity.Rating;

public interface RatingService {
	
	public Rating addRating(Rating rating);// Save Rating
	public List<Rating> getByUserId(int userId);// Get Rating By User Id
	public List<Rating> getByHotelId(int hotelId);// Get Rating By Hotel Id
	public List<Rating> getAllRating();// Get All Ratings

}
