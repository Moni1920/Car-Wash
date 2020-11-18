package com.carwash.userservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class UserConfig {
	
	@Bean
	public WebMvcConfigurer cors() {
		
		return new WebMvcConfigurer() {
			
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedMethods("Get","Post","Put","Delete")
				.allowedHeaders("*")
				.allowedOrigins("http://localhost:3000");
				
			}
		};
		
		
	}
}
	



