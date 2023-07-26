package com.epicode.m2day2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.m2day2.model.HawaiianPizza;
import com.epicode.m2day2.model.Menu;
import com.epicode.m2day2.model.PizzaMargherita;
import com.epicode.m2day2.model.SalamiPizza;

@Configuration
public class MenuConfiguration {

	@Bean
	@Scope("singleton") 
	public Menu menu() {
		Menu m = new Menu();
		
		m.getMenu().add(pizzaMargherita());
		m.getMenu().add(pizzaHawaiian());
		m.getMenu().add(pizzaSalami());
		
		
		return m;
	}
	
	@Bean
	@Scope("singleton")
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean
	@Scope("singleton")
	public HawaiianPizza pizzaHawaiian() {
		return new HawaiianPizza();
	}
	
	@Bean
	@Scope("singleton")
	public SalamiPizza pizzaSalami() {
		return new SalamiPizza();
	}

}
