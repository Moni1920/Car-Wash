package com.carwash.userservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.carwash.userservice.models.Rating;
import com.carwash.userservice.repository.Ratingrepo;

@Service
public class RatingService {
	
	 
		
		@Autowired
		private Ratingrepo  rc;
		
		
		public List<Rating> allrate()
		{
			
			return rc.findAll();
		}
		
		
		public Rating addrate(Rating bi)
		{
			return rc.save(bi);
		}
		


		
	
}
