package com.carwash.userservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.carwash.userservice.models.User;
import com.carwash.userservice.repository.UserRepo;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
//		@Autowired
//	private UserRepo repo;

	@Bean
	public  BCryptPasswordEncoder bcryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
		
	}
	@Autowired
	private UserDetailsService userdetails;
	
	@Bean
	public AuthenticationProvider authprovider() {
		
		DaoAuthenticationProvider pro =new DaoAuthenticationProvider();
		pro.setUserDetailsService(userdetails);
		pro.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return pro;
		
	}
	

	

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable()
		.authorizeRequests().antMatchers("/login").permitAll()
		.and();
		
	}

	
}
	  


