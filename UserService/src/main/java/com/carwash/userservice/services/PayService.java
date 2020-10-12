package com.carwash.userservice.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carwash.userservice.models.Payment;
import com.carwash.userservice.repository.PaymentRepo;

@Service
public class PayService {
	
	@Autowired
	 private PaymentRepo pr; 
	
	public List<Payment> getpayment()
	{
		return pr.findAll();
	}
	
	public List<Payment> getpaymentuser(String un)
	{
		List<Payment> users = pr.findAll();
		List<Payment> pays = new ArrayList<Payment>();
		for(Payment ab : users)
		{
			if(ab.getUsername().contentEquals(un))
			{
				pr.save(ab);
			}
		}
		return pays;
	}
	

	
	public Payment addpayment(Payment payment) 
	{
		return pr.save(payment);
	}
	
	
	
	public boolean updatepayment(Payment payment)
	{
		Optional<Payment> available = pr.findById(payment.getUsername());
		if(available.isPresent()) 
		{
			pr.save(payment);
			return true;
		}
		return false;
	}

}
