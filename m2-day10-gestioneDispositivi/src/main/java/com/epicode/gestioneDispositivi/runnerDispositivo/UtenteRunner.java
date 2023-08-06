package com.epicode.gestioneDispositivi.runnerDispositivo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class UtenteRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run...");
		
	}

}
