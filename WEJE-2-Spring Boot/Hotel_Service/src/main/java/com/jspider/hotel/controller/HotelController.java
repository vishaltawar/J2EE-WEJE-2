package com.jspider.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.hotel.entity.Hotel;
import com.jspider.hotel.service.HotelService;

@RestController
@RequestMapping("hotel")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	// Add Hotel or Save Hotel
	@PostMapping("/add")
	public ResponseEntity<Hotel> save(@RequestBody Hotel hotel) {
		Hotel hotel1 = hotelService.save(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
	}

	// Get Hotel By Id
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getById(@PathVariable int id) {
		Hotel hotel = hotelService.getById(id);
		return ResponseEntity.status(HttpStatus.FOUND).body(hotel);
	}

	// Get All Hotels
	@GetMapping("/getall")
	public ResponseEntity<List<Hotel>> getAll() {
		List<Hotel> hotels = hotelService.getAll();
		return ResponseEntity.status(HttpStatus.FOUND).body(hotels);
	}

	// Delete Hotel
	@DeleteMapping("/{id}")
	public ResponseEntity<Hotel> deleteById(@PathVariable int id) {
		Hotel hotel = hotelService.deleteById(id);
		return ResponseEntity.status(HttpStatus.FOUND).body(hotel);
	}
}
