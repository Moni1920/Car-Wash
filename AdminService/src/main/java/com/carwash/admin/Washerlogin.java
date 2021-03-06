package com.carwash.admin;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins={"http://localhost:3000"})
@Document(collection="washers")
public class Washerlogin {
	
	@Id
	private String id;
	private String name;
	private String emailid;
    private String password;
    
	public Washerlogin() {
		super();
	}


	public Washerlogin(String id, String name, String emailid, String password) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.password = password;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Washerlogin [id=" + id + ", name=" + name + ", emailid=" + emailid + ", password=" + password + "]";
	}

	
    
    
    
    
    
}
