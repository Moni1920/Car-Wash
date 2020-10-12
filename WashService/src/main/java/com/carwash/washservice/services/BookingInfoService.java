package com.carwash.washservice.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carwash.washservice.models.BookingInfo;
import com.carwash.washservice.repo.BookingInfoRepo;



@Service
public class BookingInfoService {
	 
	@Autowired
	private BookingInfoRepo  bir;
	

	
	
	public List<BookingInfo> allinfo()
	{
		
		return bir.findAll();
	}
	
	
	public BookingInfo addinfo(BookingInfo bi)
	{
		return bir.save(bi);
	}
	


	
	public void status(BookingInfo detail) 
	{
		
		bir.save(detail);
	}
	
public boolean editStatus(BookingInfo bi) {
		
		BookingInfo u = bir.findByEmailid(bi.getEmailid());
		if (bi.getEmailid().equals(u.getEmailid()) && bi.getDate().equals(u.getDate())) {
			 
			u.setStatus(bi.getStatus());
			
			return true;
			
		}
		return false;
	}
	
	

	
	
	
	
	

}
