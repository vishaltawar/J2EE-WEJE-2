package com.jspider.hotel.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.hotel.entity.Hotel;
import com.jspider.hotel.exception.ResourceNotFoundException;
import com.jspider.hotel.repository.HotelRepository;
import com.jspider.hotel.service.HotelService;

// This layer is working on service of Hotels.
// Here we can validate our Incoming  & Outgoing data.(Validation)
@Service
public class HotelServiceImpl implements HotelService {

	@Autowired// Auto Injecting Object By Spring Container or (IOC).
	private HotelRepository hotelRepository;

	// Saving or adding the hotels detail in database.
	@Override
	public Hotel save(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	// Retriving the hotels details by using hotel id.
	@Override
	public Hotel getById(int hotelId) {
		return hotelRepository.findById(hotelId)
				.orElseThrow(() -> new ResourceNotFoundException("Given Id is not found in database.!!"));
	}			// here we are throwing user created Exception if Id will 'null'.

	// Retriving the All hotels details.
	@Override
	public List<Hotel> getAll() {
		return hotelRepository.findAll();
	}

	// Deleting the hotels details by using hotel id.
	@Override
	public Hotel deleteById(int hotelId) {
		Hotel hotel = hotelRepository.findById(hotelId)
				.orElseThrow(() -> new ResourceNotFoundException("Given Id is not found in database.!!"));
		hotelRepository.delete(hotel);
		return hotel;
	}

}
