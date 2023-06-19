package com.jspider.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspider.hotel.entity.Hotel;

@Repository // This is Repository layer, it's handle or manipulate all database related
			// operation using JpaRepository.it's inbuilt Interface
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
	// JpaRepository<Hotel, Integer> here 'Hotel' is Class name for which class you want perform operation and
	// 'Integer' is Primary key of that class.it's must be pass.
	// Here we can create custom method also but there are some Rule...

}
