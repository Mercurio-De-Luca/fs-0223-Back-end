package com.epicode.gestionePrenotazioni.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.gestionePrenotazioni.model.Edificio;
import com.epicode.gestionePrenotazioni.model.Postazione;
import com.epicode.gestionePrenotazioni.model.Utente;

@Configuration
public class PrenotazioniConfiguration {

	@Bean("postazione")
	@Scope("prototype")
	public Postazione postzione() {
		return new Postazione();
	}
	
	@Bean("edificio")
	@Scope("prototype")
	public Edificio edificio() {
		return new Edificio();
	}
	
	@Bean
	@Scope("prototype")
	public Utente utente() {
		return new Utente();
	}
	
//	@Bean
//	@Scope("prototype")
//	public Postazione postzione() {
//		return new Postazione();
//	}
}
