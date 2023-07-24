package com.epicode.m2day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class M2Day1Application {

	public static void main(String[] args) {
		SpringApplication.run(M2Day1Application.class, args);
		
		GestioneDelMenu m = new GestioneDelMenu();
		m.stampaMenu(); 
		
	}

}
