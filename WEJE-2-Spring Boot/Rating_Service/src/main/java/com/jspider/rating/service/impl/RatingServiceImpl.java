package com.jspider.rating.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.rating.entity.Rating;
import com.jspider.rating.repository.RatingRepository;
import com.jspider.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating addRating(Rating rating) {
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getByUserId(int userId) {

		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getByHotelId(int hotelId) {

		return ratingRepository.findByHotelId(hotelId);
	}

	@Override
	public List<Rating> getAllRating() {
		return ratingRepository.findAll();
	}

}
