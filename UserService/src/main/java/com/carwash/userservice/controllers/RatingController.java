package com.carwash.userservice.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.userservice.models.BookingInfo;
import com.carwash.userservice.models.Rating;
import com.carwash.userservice.services.RatingService;

@RestController
@RequestMapping("/api")
public class RatingController {
	
	@Autowired
	 private RatingService serve;
	
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@GetMapping("/rate")
	public Collection<Rating>  allrating() {
		
	return serve.allrate();
		  
	}
	
	
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@PostMapping("/rating")
	public String  addrating(@RequestBody Rating detail) {
		
		
		serve.addrate(detail);
		return "records posted";
	}

}
