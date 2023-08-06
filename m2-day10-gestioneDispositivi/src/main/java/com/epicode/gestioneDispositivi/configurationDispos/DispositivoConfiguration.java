package com.epicode.gestioneDispositivi.configurationDispos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.gestioneDispositivi.model.Dispositivo;


@Configuration
public class DispositivoConfiguration {

	@Bean("bean_dispositivo")
	@Scope("prototype")
	public Dispositivo dispositivo() {
		return new Dispositivo();
	}
}
