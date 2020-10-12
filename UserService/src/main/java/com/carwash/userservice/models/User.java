package com.carwash.userservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins={"http://localhost:3000"})
@Document(collection="Userdata")
public class User {
	
	
	@Id
	private String id;
	private String emailid;
	private String username;
    private String password;
    
    
   
	
	public User(String id, String emailid, String username, String password) {
		super();
		this.id = id;
		this.emailid = emailid;
		this.username = username;
		this.password = password;
	}




	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", emailid=" + emailid + ", username=" + username + ", password=" + password + "]";
	}



	

	

}
