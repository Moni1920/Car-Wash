package com.carwash.userservice.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.userservice.models.Cardetails;
import com.carwash.userservice.models.User;
import com.carwash.userservice.repository.UserRepo;
import com.carwash.userservice.services.UserService;



@RestController
public class LoginController {
	
	@Autowired
	 private UserService serve;
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@GetMapping("/users")
	public List<User> getcustomer() 
	{
		return serve.getusers();
	}
	
	
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@PostMapping("/register")
	public boolean addcustomer(@RequestBody User user) 
	{
		return serve.adduser(user);
	}
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@PostMapping("/login")
	public boolean loginValidate(@RequestBody User user) 
	{
		return serve.loginuser(user);
		
	}
	
	@GetMapping("/getprofile/{username}")
	public List<User> getbyuser(@PathVariable("username") String username)
	{
		return serve.getprofile(username);
	}
	
	
	@CrossOrigin(origins={"http://localhost:3000"})	
	@PostMapping("/edit")
	public boolean editpass(@RequestBody User user) {
		
			return serve.editProfile(user);
		}
	
	
		
@CrossOrigin(origins={"http://localhost:3000"})
@PostMapping("/getuse")
public List<User> getuse(@RequestBody User user) {

	return serve.getuserbyemail(user);
}
}

		
		
		
		
		
	

	
		
	
	
	
		

