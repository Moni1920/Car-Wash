package com.carwash.payment;


import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins={"http://localhost:3000"})
public class WashService {
	
	private double price;
	private String currency;
	private String method;
	private String intent;
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getIntent() {
		return intent;
	}
	public void setIntent(String intent) {
		this.intent = intent;
	}
	public WashService(double price, String currency, String method, String intent) {
		super();
		this.price = price;
		this.currency = currency;
		this.method = method;
		this.intent = intent;
	}
	public WashService() {
		super();
	}
	
	
	
	
	
	
	

}
