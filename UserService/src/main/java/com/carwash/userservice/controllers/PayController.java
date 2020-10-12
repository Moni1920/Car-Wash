package com.carwash.userservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.userservice.models.Payment;
import com.carwash.userservice.services.PayService;

@RestController
public class PayController {
	
	@Autowired
	private PayService payservice;
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@GetMapping("/getpay")
	public List<Payment> getpayment()
	{
		return payservice.getpayment();
	}
	
	@GetMapping("/getpaymentbyuser/{username}")
	public List<Payment> getpaymentuser(@PathVariable String un)
	{
		return payservice.getpaymentuser(un);
	}
	
	
	
	
	@CrossOrigin(origins={"http://localhost:3000"})
	@PostMapping("/addpayment")
	public Payment addpayment(@RequestBody Payment payment)
	{
		return payservice.addpayment(payment);
	}
	
	

}
