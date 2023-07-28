package com.epicode.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.epicode.model.Pizza;


@Configuration
@PropertySource("classpath:application.properties")
public class PizzeConfiguration {

	
	@Bean("pizza")
	@Scope("prototype")
	public Pizza setPizza() {
		return new Pizza();
	}
	
}
