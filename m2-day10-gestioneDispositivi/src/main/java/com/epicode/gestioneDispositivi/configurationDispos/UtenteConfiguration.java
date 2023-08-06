package com.epicode.gestioneDispositivi.configurationDispos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.gestioneDispositivi.model.Utente;

@Configuration
public class UtenteConfiguration {

	@Bean("bean_utente")
	@Scope("prototype")
	public Utente utente() {
		return new Utente();
	}
	
}
