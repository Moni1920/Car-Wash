package com.carwash.washservice.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.carwash.washservice.models.Washerlogin;
import com.carwash.washservice.repo.WasherRepo;

@Service
public class WasherService {
	
	@Autowired
	private WasherRepo washerrepo;
	
	public List<Washerlogin> getwasher() 
	{
		return washerrepo.findAll();
	}
	
	public boolean addwasher(Washerlogin wl) 
	{
		
		List<Washerlogin> wls= washerrepo.findAll();
		for(Washerlogin ab : wls)
		{
			if(ab.getEmailid().contentEquals(wl.getEmailid()))
				
				washerrepo.save(wl);
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean loginwasher(Washerlogin wash) 
	{
		
		List<Washerlogin> de=washerrepo.findAll();
		for (Washerlogin ab: de)
		{
			if(ab.getEmailid().contentEquals(wash.getEmailid())&& ab.getPassword().contentEquals(wash.getPassword()))
			{
				return true;
			}
		}
		return false;
			
	}
	
	

  
	
	

}
