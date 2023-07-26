package com.epicode.m2day2.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.epicode.m2day2.configuration.MenuConfiguration;
import com.epicode.m2day2.model.Menu;

@Component
public class PizzeRunner implements CommandLineRunner {
	
	AnnotationConfigApplicationContext appContext;
	Menu menu;

	@Override
	public void run(String... args) throws Exception {
		
		stampaMenu();
		
	}
	
	public void stampaMenu() {
		appContext = new AnnotationConfigApplicationContext(MenuConfiguration.class);
		menu = (Menu) appContext.getBean("menu");
		System.out.println("***** Menu *****");
		System.out.println("Pizzas");
		
		menu.getMenu().forEach(p -> System.out.println(p.getMenuLine()));
		
		System.out.println();
	}
}
