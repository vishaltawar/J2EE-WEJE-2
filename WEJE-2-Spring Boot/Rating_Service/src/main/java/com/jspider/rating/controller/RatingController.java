package com.jspider.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.rating.entity.Rating;
import com.jspider.rating.service.RatingService;

@RestController
@RequestMapping("rating")
public class RatingController {

	@Autowired
	private RatingService ratingService;

	@PostMapping("/add")
	public ResponseEntity<Rating> addRating(@RequestBody Rating rating) {
		Rating saveRating = ratingService.addRating(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveRating);
	}

	@GetMapping("/byuser/{userId}")
	public ResponseEntity<List<Rating>> findByUserId(@PathVariable int userId) {
		List<Rating> userRating = ratingService.getByUserId(userId);
		return ResponseEntity.status(HttpStatus.FOUND).body(userRating);
	}

	@GetMapping("/byhotel/{hotelId}")
	public ResponseEntity<List<Rating>> findByHotelId(@PathVariable int hotelId) {
		List<Rating> hotelRating = ratingService.getByHotelId(hotelId);
		return ResponseEntity.status(HttpStatus.FOUND).body(hotelRating);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Rating>> getAllRAting() {
		List<Rating> allRating = ratingService.getAllRating();
		return ResponseEntity.status(HttpStatus.FOUND).body(allRating);
	}

}
