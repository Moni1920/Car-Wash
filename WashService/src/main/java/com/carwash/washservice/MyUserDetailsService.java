package com.carwash.washservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.carwash.washservice.models.Washerlogin;
import com.carwash.washservice.repo.WasherRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private WasherRepo repo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       Washerlogin user =repo.findByEmailid(email);
		
		if(user==null)
			throw new UsernameNotFoundException("User 404 ");
		
		
		return new UserPrincipal(user);
		
	}

	
	

	   

	   
	    
	   
	   

	}
	

