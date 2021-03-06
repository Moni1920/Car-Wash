package com.carwash.washservice.controllers;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.carwash.washservice.models.Rating;
import com.carwash.washservice.models.Reqdetails;
import com.carwash.washservice.models.Washerlogin;
import com.carwash.washservice.services.WasherService;




@RestController
@RequestMapping("/api")
public class WasherController {
	
	@Autowired
	private WasherService washerserve;
	
	@Autowired
	private RestTemplate rest;
	
	@Autowired
	private DiscoveryClient discoveryclient;
	
	
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@GetMapping("/get")
	public List<Washerlogin> get() 
	{
		return washerserve.getwasher();
	}
	
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@PostMapping("/registerWasher")
	public boolean addwasher(@RequestBody Washerlogin wl) 
	{
		return washerserve.addwasher(wl);
	}
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@PostMapping("/loginwasher")
	public boolean Validlogin(@RequestBody Washerlogin wl) 
	{
		return washerserve.loginwasher(wl);
		
	}
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@GetMapping("/getcar")
	public Collection<Reqdetails> getdetails() throws RestClientException,IOException  {
		
		
		List<ServiceInstance> instances=discoveryclient.getInstances("UserService");
		
		ServiceInstance serviceinstances=instances.get(0);
		
		String baseUrl= serviceinstances.getUri()+"/details";
				
		 Collection < Reqdetails > list = rest.getForObject(baseUrl, Collection.class);
		 System.out.println("RESPONSE " + list);
	        return list;
	    }
	
	
	
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@GetMapping("/getrate")
	public Collection<Rating> getratings() throws RestClientException,IOException  {
		
		
		List<ServiceInstance> instances=discoveryclient.getInstances("UserService");
		
		ServiceInstance serviceinstances=instances.get(0);
		
		String baseUrl= serviceinstances.getUri()+"/rate";
				
		 Collection < Rating > list = rest.getForObject(baseUrl, Collection.class);
		 System.out.println("RESPONSE " + list);
	        return list;
	    }
	 

	
		
	
	
		

		
		
		
	
	
		
		
	}
	


