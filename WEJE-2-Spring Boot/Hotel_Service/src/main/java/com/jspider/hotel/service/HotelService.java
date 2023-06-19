package com.jspider.hotel.service;

import java.util.List;

import com.jspider.hotel.entity.Hotel;

// It's Hotels Service here all Service are Register. as abstract method.
public interface HotelService {

	public Hotel save(Hotel hotel);// Add Hotel Details

	public Hotel getById(int hotelId);// Get Hotel By Id

	public List<Hotel> getAll();// Get All Hotels

	public Hotel deleteById(int hotelId);// Delete Hotel By Id

}
