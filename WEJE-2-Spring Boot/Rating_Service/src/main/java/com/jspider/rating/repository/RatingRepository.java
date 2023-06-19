package com.jspider.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspider.rating.entity.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating,Integer> {
	
	public List<Rating> findByUserId(int userId);
	public List<Rating> findByHotelId(int hotelId);

}
