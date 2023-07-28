package com.epicode.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.model.Menu;

@Configuration
public class MenuConfiguration {
	
	@Bean("menulist")
	@Scope("singleton") 
	public Menu menu() {
	
		return new Menu();
		
	}
}
