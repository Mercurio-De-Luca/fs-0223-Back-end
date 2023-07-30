package com.epicode.gestionePrenotazioni.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.gestionePrenotazioni.model.Postazione;

@Configuration
public class PostazioneConfiguration {

	
	@Bean("customPostazioneBean")
	@Scope("prototype")
	public Postazione customUser() {
		return new Postazione();
	}
}
