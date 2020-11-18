package com.carwash.washservice;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerWConfig {
	 @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.any())              
	          .paths(PathSelectors.ant("/api/*"))                          
	          .build()
	          .apiInfo(apiInfo());
	         
	 }
	 
	 private ApiInfo apiInfo() {
		    return new ApiInfo(
		      "Washer Service", 
		      "", 
		      "API TOS", 
		      "Terms of service", 
		      new springfox.documentation.service.Contact("Monica", "www.example.com", "myeaddress@company.com"), 
		      "", "", Collections.emptyList());
		}
	 

}
