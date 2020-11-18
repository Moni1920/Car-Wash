package com.carwash.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carwash.userservice.models.Contact;

@Repository
public interface ContactRepo  extends MongoRepository<Contact, String>{

}
