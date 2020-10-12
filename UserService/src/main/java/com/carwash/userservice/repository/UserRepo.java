package com.carwash.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.carwash.userservice.models.User;



public interface UserRepo extends MongoRepository<User, String> {
	
	User findByUsername(String username);
	User findByEmailid(String emailid );

}
