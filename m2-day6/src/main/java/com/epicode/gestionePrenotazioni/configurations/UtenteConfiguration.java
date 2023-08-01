package com.epicode.gestionePrenotazioni.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.gestionePrenotazioni.model.Utente;

@Configuration
public class UtenteConfiguration {

	@Bean("customUtenteBean")
	@Scope("prototype")
	public Utente customUser() {
		return new Utente();
	}
}
