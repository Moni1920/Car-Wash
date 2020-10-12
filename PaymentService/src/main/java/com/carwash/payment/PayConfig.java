package com.carwash.payment;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;



@Configuration
public class PayConfig {
	
	@Value("${paypal.client.id}")
	private String clientId;
	@Value("${paypal.client.secret}")
	private String clientSecret;
	@Value("${paypal.mode}")
	private String mode;
	
	@Bean
	public Map<String,String> paypalConfig(){
		
		Map<String,String> map=new HashMap<>();
		map.put("mode", mode);
		return map;	
	}
	
	@Bean
	public OAuthTokenCredential  oAuthTokenCredential() {
		
		return new OAuthTokenCredential(clientId,clientSecret,paypalConfig());

	}
	
	@Bean
	public APIContext apicontext() throws PayPalRESTException {
		
		APIContext context = new APIContext(oAuthTokenCredential().getAccessToken());
		context.setConfigurationMap(paypalConfig());
		return context;
	}
		
		
		
		
		
		
	}

	
	
	
	
    

