package com.carwash.washservice;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.carwash.washservice.models.Washerlogin;

public class UserPrincipal implements UserDetails {

	private Washerlogin washer;
	
	
	
	public UserPrincipal(Washerlogin washer) {
		super();
		this.washer = washer;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return Collections.singleton(new SimpleGrantedAuthority("Washer"));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return washer.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return washer.getEmailid();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
