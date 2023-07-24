package com.epicode.m2day1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epicode.classes.Menu;
import com.epicode.configuration.MenuConfiguration;

public class GestioneDelMenu {
	
	AnnotationConfigApplicationContext appContext;
	Menu menu;

	public GestioneDelMenu() {
		appContext = new AnnotationConfigApplicationContext(MenuConfiguration.class);
		menu = (Menu) appContext.getBean("menu");
	}
	
	public void stampaMenu() {
		System.out.println("Menu");
		menu.getMenu().forEach(p -> System.out.println(p.getMenu()));
	}
}
