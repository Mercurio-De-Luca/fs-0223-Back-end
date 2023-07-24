package com.epicode.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.classes.HawaiianPizza;
import com.epicode.classes.Menu;
import com.epicode.classes.PizzaMargherita;
import com.epicode.classes.SalamiPizza;

@Configuration
public class MenuConfiguration {

	@Bean
	@Scope("singleton")
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean
	@Scope("singleton")
	public HawaiianPizza hawaiianPizza() {
		return new HawaiianPizza();
	}
	
	@Bean
	@Scope("singleton")
	public SalamiPizza salamiPizza() {
		return new SalamiPizza();
	}
	
	@Bean
	@Scope("singleton")
	public Menu menu() {
		
		Menu menu = new Menu();
		
		menu.getMenu().add(pizzaMargherita());
		menu.getMenu().add(hawaiianPizza());
		menu.getMenu().add(salamiPizza());
		
		return menu;
	}
	
}
