package com.tech.rating.services;

import java.util.List;

import com.tech.rating.entities.Rating;

public interface RatingService {

	// create rating
	Rating create(Rating rating);

	// get all rating
	List<Rating> getRatings();

	// get all by UserID

	List<Rating> getRatingByUserId(String userId);

	// get all by Hotel
	List<Rating> getRatingByHotelId(String hotelId);
}
