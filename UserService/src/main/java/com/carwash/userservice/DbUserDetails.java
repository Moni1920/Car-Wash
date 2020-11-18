package com.carwash.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.carwash.userservice.models.User;
import com.carwash.userservice.repository.UserRepo;

@Service
public class DbUserDetails implements UserDetailsService {

	@Autowired
	private UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		User user =repo.findByEmailid(email);
		
		if(user==null)
			throw new UsernameNotFoundException("User 404 ");
		
		
		return new UserPrincipal(user);
		
	}

	
	


	

	
	
}
