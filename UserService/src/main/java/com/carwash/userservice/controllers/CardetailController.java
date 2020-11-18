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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.carwash.userservice.models.Cardetails;
import com.carwash.userservice.models.User;
import com.carwash.userservice.services.CardetailService;



@RestController
@RequestMapping("/api")
public class CardetailController {
	
	@Autowired
	 private CardetailService serve;
	
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@GetMapping("/details")
	public List<Cardetails>  getcar() {
		
	return serve.getdetails();
		  
	}
	@CrossOrigin(origins={"http://localhost:3000"})
	@PostMapping("/book")
	public String  addcar(@RequestBody Cardetails detail) {
		
		serve.adddetails(detail);
		return "records posted";
	}

	
	@CrossOrigin(origins={"http://localhost:3000"})
	@PostMapping(value="/getcardetails")
	public List<Cardetails> getCarDetailsbyId(@RequestBody User user) {
	
		return serve.getCarDetailsbyemail(user);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
		


