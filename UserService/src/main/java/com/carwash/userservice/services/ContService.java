package com.carwash.userservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carwash.userservice.models.Contact;
import com.carwash.userservice.models.Rating;
import com.carwash.userservice.repository.ContactRepo;


@Service
public class ContService {
	

	
	@Autowired
	private ContactRepo  rc;
	
	
	public Contact addcont(Contact bi)
	{
		return rc.save(bi);
	}
	
	
	public List<Contact> allcontacts()
	{
		
		return rc.findAll();
	}
	
	

}
