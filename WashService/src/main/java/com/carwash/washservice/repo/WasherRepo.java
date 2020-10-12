package com.carwash.washservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.carwash.washservice.models.Washerlogin;

public interface WasherRepo  extends MongoRepository<Washerlogin, String> {
	
	
	
	Washerlogin findByEmailid(String emailid );

}
