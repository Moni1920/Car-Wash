package com.carwash.userservice.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.carwash.userservice.models.User;
import com.carwash.userservice.repository.UserRepo;


@Service
public class UserService{
	
	@Autowired
	UserRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public List<User> getusers() 
	{
		return repo.findAll();
	}
	
	public boolean adduser(User user) 
	{
		
		List<User> users= repo.findAll();
		for(User ab : users)
		{
			if(ab.getEmailid().contentEquals(user.getEmailid())) {
				
				return false;
			}
			
		}
//		user.setPassword(encoder.encode(user.getPassword()));
		repo.save(user);
		return true;
	}
	
	
	public boolean loginuser(User user) 
	{
		
		List<User> users=repo.findAll();
		System.out.println(users);
		System.out.println(user);
		for (User ab: users)
		{
			if(ab.getEmailid().contentEquals(user.getEmailid())&& ab.getPassword().contentEquals((user.getPassword())))
			{
				return true;
			}
		}
		return false;
			
	}
	
	
	public boolean editProfile(User user) {
		
		User u = repo.findByEmailid(user.getEmailid());
		if (user.getEmailid().equals(u.getEmailid())) {
			u.setUsername(user.getUsername());
			u.setPassword(user.getPassword());
			repo.save(u);
			return true;
			
		}
		return false;
	}
	
	public List<User> getuserbyemail(User user)
	{
		List<User> users = new ArrayList<User>();
		List<User> all = repo.findAll();
		for(User l : all)
		{
			if(l.getEmailid().contentEquals(user.getEmailid()))
			{
				users.add(l);
			}
		}
		return users;
	}
	
	public List<User> getprofile(String username)
	{
		List<User> users = new ArrayList<User>();
		List<User> all = repo.findAll();
		for(User u : all)
		{
			if(u.getUsername().contentEquals(username))
			{
				users.add(u);
			}
		}
		return users;
	}


	
	
	
	
	
}
	
	
	
		
		
		
		
		
	

	
			
		
			
		


