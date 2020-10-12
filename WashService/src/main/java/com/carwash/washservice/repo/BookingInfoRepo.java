package com.carwash.washservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.carwash.washservice.models.BookingInfo;



@Repository
public interface BookingInfoRepo extends MongoRepository<BookingInfo, String> {

	BookingInfo findByDate(String date);
	BookingInfo findByEmailid(String emailid );

}
