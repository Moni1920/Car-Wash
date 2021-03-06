package com.carwash.admin;
 


import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;



@CrossOrigin(origins={"http://localhost:3000"})
@Document(collection="Cardetails")
@Component
public class Cardetails {
	
	
	@Id
	private String id;
	private String emailid;
	private long mobileNumber;
	private String carmodel;	
	private String location;
	private String serviceType;	
	private String date;
	private String time;
    private String desc;
    private String bookingid;
    
    
    
    
	public Cardetails() {
		super();
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




	public long getMobileNumber() {
		return mobileNumber;
	}




	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}




	public String getCarmodel() {
		return carmodel;
	}




	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public String getServiceType() {
		return serviceType;
	}




	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}




	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	public String getTime() {
		return time;
	}




	public void setTime(String time) {
		this.time = time;
	}




	public String getDesc() {
		return desc;
	}




	public void setDesc(String desc) {
		this.desc = desc;
	}




	public String getBookingid() {
		return bookingid;
	}




	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}







	public Cardetails(String id, String emailid, long mobileNumber, String carmodel, String location,
			String serviceType, String date, String time, String desc, String bookingid
			) {
		super();
		this.id = id;
		this.emailid = emailid;
		this.mobileNumber = mobileNumber;
		this.carmodel = carmodel;
		this.location = location;
		this.serviceType = serviceType;
		this.date = date;
		this.time = time;
		this.desc = desc;
		this.bookingid = bookingid;
		
	
	
	
    
	
	
	
	}
	
}

	
	
	
	
    
	
	