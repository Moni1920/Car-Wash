package com.carwash.washservice.controllers;


import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.washservice.models.BookingInfo;
import com.carwash.washservice.services.BookingInfoService;



@RestController
@RequestMapping("/api")
public class InfoController {

	
	@Autowired
	 private BookingInfoService serve;
	
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@GetMapping("/info")
	public Collection<BookingInfo>  allinfo() {
		
	return serve.allinfo();
		  
	}
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@GetMapping("/info/{username}")
	public Collection<BookingInfo> getinfo(@PathVariable("username") String cust) {
		
	return serve.allinfo();
		  
	}
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@PostMapping("/status")
	public String  addstatus(@RequestBody BookingInfo detail) {
		
		
		serve.status(detail);
		return "records posted";
	}
	
	
	@CrossOrigin(origins={"http://localhost:3000"})	
	@PostMapping("/edits")
	public boolean editS(@RequestBody BookingInfo bi) {
		
			return serve.editStatus(bi);
		}
	
	
	
	
	
	
	
	
}
