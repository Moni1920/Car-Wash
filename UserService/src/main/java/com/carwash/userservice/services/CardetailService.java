package com.carwash.userservice.services;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.carwash.userservice.models.Cardetails;
import com.carwash.userservice.models.User;
import com.carwash.userservice.repository.CardetailsRepo;



@Service
public class CardetailService {

	
	@Autowired
	private CardetailsRepo repo;
	
	
	public List<Cardetails> getdetails(){
		
		return repo.findAll();
		
		}
	
	public void adddetails(Cardetails detail) {
		
		repo.save(detail);
	}
	
	
	
	
	
	
	
	
	
 
	
	
	
	
	
	public List<Cardetails> getCarDetailsbyemail(User user)
	{
		List<Cardetails> users = new ArrayList<Cardetails>();
		List<Cardetails> all = repo.findAll();
		for(Cardetails l : all)
		{
			if(l.getEmailid().contentEquals(user.getEmailid()))
			{
				users.add(l);
			}
		}
		return users;
	}
	
	
	

	
	
//	public boolean updatedetails(Cardetails detail)
//	{
//		Optional<Cardetails> available = repo.findById(detail.getUsername());
//		if(available.isPresent()) 
//		{
//			repo.save(detail);
//			return true;
//		}
//		return false;
//	}
//	
//	
//	public boolean deletedetails(String id)
//	{
//		Optional<Cardetails> car =  repo.findById(id);
//		if(car.isPresent())
//		{
//			repo.deleteById(id); 
//			return true;
//		}
//		return false;
//	}
//	
//	
	
	
}
	