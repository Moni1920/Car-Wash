package com.carwash.admin;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="AcceptedOrders")
public class BookingInfo {
	
	
	@Id
	private String id;
    private String emailid; 
    private String washername;
    private String servicetype;
	private String date;
	private Integer amount;
    private String status;
    
    
    
	public BookingInfo() {
		super();
	}



	public BookingInfo(String id, String emailid, String washername, String servicetype, String date, Integer amount,
			String status) {
		super();
		this.id = id;
		this.emailid = emailid;
		this.washername = washername;
		this.servicetype = servicetype;
		this.date = date;
		this.amount = amount;
		this.status = status;
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



	public String getWashername() {
		return washername;
	}



	public void setWashername(String washername) {
		this.washername = washername;
	}



	public String getServicetype() {
		return servicetype;
	}



	public void setServicetype(String servicetype) {
		this.servicetype = servicetype;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public Integer getAmount() {
		return amount;
	}



	public void setAmount(Integer amount) {
		this.amount = amount;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}


	

	
	



	
    
	

}
