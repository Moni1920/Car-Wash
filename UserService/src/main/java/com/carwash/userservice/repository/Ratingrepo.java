package com.carwash.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.userservice.models.Rating;

public interface Ratingrepo extends MongoRepository<Rating, String> {

}
