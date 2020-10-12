package com.carwash.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carwash.userservice.models.Payment;


@Repository
public interface PaymentRepo  extends MongoRepository<Payment, String>{
	
	
	

}
