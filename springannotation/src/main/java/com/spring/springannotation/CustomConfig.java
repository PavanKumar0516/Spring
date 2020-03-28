package com.spring.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value= {"com.spring.springannotation"})
public class CustomConfig {
	@Bean
	public Customer getCustomer() {
		return new Customer();
	}
}
