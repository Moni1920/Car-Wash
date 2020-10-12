package com.carwash.userservice.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.userservice.models.Cardetails;


public interface CardetailsRepo extends MongoRepository<Cardetails, String> {

	Cardetails findByEmailid(String emailid);

		
		
		

	}



