package com.epicode.gestionePrenotazioni.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.gestionePrenotazioni.model.Edificio;

@Configuration
public class EdificioConfiguration {

	@Bean("customEdificioBean")
	@Scope("prototype")
	public Edificio customUser() {
		return new Edificio();
	}
}
