package com.carwash.userservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins={"http://localhost:3000"})
@Document(collection="Contact")
public class Contact {
	
	@Id
	private String id;
	private String username;
    private String mobileNumber;
    private String location;
    private String message;
    
    
    
    
    
	public Contact(String id, String username, String mobileNumber, String location, String message) {
		super();
		this.id = id;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.location = location;
		this.message = message;
	}
	
	
	
	public Contact() {
		super();
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
    
    
    

}
