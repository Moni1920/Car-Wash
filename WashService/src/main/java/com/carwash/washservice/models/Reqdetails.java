package com.carwash.washservice.models;

import org.springframework.data.annotation.Id;

public class Reqdetails {
	
	@Id
	private String id;
	private String username;
	private String mobileNumber;
	private String carmodel;
	private String location;
	private String serviceType;
	private String date;
	private String time;
	private String desc;
	
	
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


	public Reqdetails() {
		super();
	}


	public Reqdetails(String id, String username, String mobileNumber, String carmodel, String location,
			String serviceType, String date, String time, String desc) {
		super();
		this.id = id;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.carmodel = carmodel;
		this.location = location;
		this.serviceType = serviceType;
		this.date = date;
		this.time = time;
		this.desc = desc;
	}

}
