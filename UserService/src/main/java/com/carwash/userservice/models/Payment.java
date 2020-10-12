package com.carwash.userservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins={"http://localhost:3000"})
@Document(collection="Cardetails")
public class Payment {
	
	
		@Id
		private String id;
		private String username;
		private String cardholdername;
		private String cardnumber;
		private String expmon;
		private String expyear;
		private Integer cvv;
		
		
		public Payment(String id, String username, String cardholdername, String cardnumber, String expmon,
				String expyear, Integer cvv) {
			super();
			this.id = id;
			this.username = username;
			this.cardholdername = cardholdername;
			this.cardnumber = cardnumber;
			this.expmon = expmon;
			this.expyear = expyear;
			this.cvv = cvv;
		}


		public Payment() {
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
		public String getCardholdername() {
			return cardholdername;
		}
		public void setCardholdername(String cardholdername) {
			this.cardholdername = cardholdername;
		}
		public String getCardnumber() {
			return cardnumber;
		}
		public void setCardnumber(String cardnumber) {
			this.cardnumber = cardnumber;
		}
		public String getExpmon() {
			return expmon;
		}
		public void setExpmon(String expmon) {
			this.expmon = expmon;
		}
		public String getExpyear() {
			return expyear;
		}
		public void setExpyear(String expyear) {
			this.expyear = expyear;
		}
		public Integer getCvv() {
			return cvv;
		}
		public void setCvv(Integer cvv) {
			this.cvv = cvv;
		}
		

		

}
