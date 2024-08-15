package com.landingpage.langinnails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.landingpage")
public class LanginnailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanginnailsApplication.class, args);
	}

	
}
