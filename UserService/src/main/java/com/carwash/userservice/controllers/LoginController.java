package com.carwash.userservice.controllers;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.userservice.DbUserDetails;
import com.carwash.userservice.models.Cardetails;
import com.carwash.userservice.models.Contact;
import com.carwash.userservice.models.Rating;
import com.carwash.userservice.models.User;
import com.carwash.userservice.repository.UserRepo;
import com.carwash.userservice.services.ContService;
import com.carwash.userservice.services.UserService;



@RestController
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	 private UserService serve;
	@Autowired
	 private ContService ser;
	
	
	
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



@CrossOrigin(origins={"http://localhost:3000"})
@PostMapping("/contact")
public String  addconta(@RequestBody Contact detail) {
	
	
	ser.addcont(detail);
	return "records posted";
}


@CrossOrigin(origins={"http://localhost:3000"})
@GetMapping("/getcons")
public Collection<Contact>  allCons() {
	
return ser.allcontacts();
	  
}



}

		
		
		
		
		
	

	
		
	
	
	
		

