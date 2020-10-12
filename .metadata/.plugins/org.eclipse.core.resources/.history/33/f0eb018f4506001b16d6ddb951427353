package com.carwash.userservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ratings")
public class Rating {
	
	@Id
	private String id;
	private Integer rating;
	private String  comments;
	
	
	public Rating() {
		super();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Integer getRating() {
		return rating;
	}


	public void setRating(Integer rating) {
		this.rating = rating;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public Rating(String id, Integer rating, String comments) {
		super();
		this.id = id;
		this.rating = rating;
		this.comments = comments;
	}

	
	
	
	
	

}
