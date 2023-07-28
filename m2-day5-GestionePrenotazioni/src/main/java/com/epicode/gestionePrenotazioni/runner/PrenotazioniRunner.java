package com.epicode.gestionePrenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.gestionePrenotazioni.service.PrenotazioniService;

@Component
public class PrenotazioniRunner implements CommandLineRunner {
	
	@Autowired PrenotazioniService ps;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("start application...");
		
	}

}
