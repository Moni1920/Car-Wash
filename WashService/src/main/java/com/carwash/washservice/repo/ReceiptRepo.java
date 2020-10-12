package com.carwash.washservice.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carwash.washservice.models.Receipt;

@Repository
public interface ReceiptRepo extends MongoRepository<Receipt, String>{

}
