package com.carwash.admin;

import java.io.IOException;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;



@RestController
public class AdminController {
	

	@Autowired
	private RestTemplate rest;
	
	@Autowired
	private DiscoveryClient discoveryclient;
	

	
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@GetMapping("/getusers")
	public Collection<Users> getdetails() throws RestClientException,IOException  {
		
		
		List<ServiceInstance> instances=discoveryclient.getInstances("UserService");
		
		ServiceInstance serviceinstances=instances.get(0);
		
		String baseUrl= serviceinstances.getUri()+"api/users";
		
		 Collection < Users > list = rest.getForObject(baseUrl, Collection.class);
		 System.out.println("RESPONSE " + list);
	        return list;
	    }
	
	
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@GetMapping("/getcarde")
	public Collection<Cardetails> getcar() throws RestClientException,IOException  {
		
		
		List<ServiceInstance> instances=discoveryclient.getInstances("UserService");
		
		ServiceInstance serviceinstances=instances.get(0);
		
		String baseUrl= serviceinstances.getUri()+"api/details";
		
		 Collection < Cardetails > list = rest.getForObject(baseUrl, Collection.class);
		 System.out.println("RESPONSE " + list);
	        return list;
	    }
	 
	 
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@GetMapping("/getinfos")
	public Collection<BookingInfo> getinfos() throws RestClientException,IOException  {
		
		
		List<ServiceInstance> instances=discoveryclient.getInstances("WasherService");
		
		ServiceInstance serviceinstances=instances.get(0);
		
		String baseUrl= serviceinstances.getUri()+"api/info 	";
		
		 Collection < BookingInfo > list = rest.getForObject(baseUrl, Collection.class);
		 System.out.println("RESPONSE " + list);
	        return list;
	    }
	 
	
	
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@GetMapping("/getratings")
	public Collection<Rating> getrate() throws RestClientException,IOException  {
		
		
		List<ServiceInstance> instances=discoveryclient.getInstances("UserService");
		
		ServiceInstance serviceinstances=instances.get(0);
		
		String baseUrl= serviceinstances.getUri()+"api/rate";
		
		 Collection < Rating > list = rest.getForObject(baseUrl, Collection.class);
		 System.out.println("RESPONSE " + list);
	        return list;
	    }
	 


	@CrossOrigin(origins={"http://localhost:3000"})
	@GetMapping("/getwashers")
	public Collection<Washerlogin> getwash() throws RestClientException,IOException  {
		
		
		List<ServiceInstance> instances=discoveryclient.getInstances("WasherService");
		
		ServiceInstance serviceinstances=instances.get(0);
		
		String baseUrl= serviceinstances.getUri()+"api/get";
		
		 Collection < Washerlogin > list = rest.getForObject(baseUrl, Collection.class);
		 System.out.println("RESPONSE " + list);
	        return list;
	    }
	 
	


	

}
