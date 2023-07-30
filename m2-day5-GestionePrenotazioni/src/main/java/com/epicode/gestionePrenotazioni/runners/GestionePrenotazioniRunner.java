package com.epicode.gestionePrenotazioni.runners;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.gestionePrenotazioni.enumerated.TipoPostazione;
import com.epicode.gestionePrenotazioni.model.Edificio;
import com.epicode.gestionePrenotazioni.model.Postazione;
import com.epicode.gestionePrenotazioni.model.Utente;
import com.epicode.gestionePrenotazioni.services.GestionePrenotazioniService;

@Component
public class GestionePrenotazioniRunner implements CommandLineRunner {
	
	@Autowired GestionePrenotazioniService gps;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Run...");
		
		Edificio e1 = gps.creaEdificio("edificio1", "via edificio1", "Napoli");
		Edificio e2 = gps.creaEdificio("edificio2", "via edificio2", "Roma");
		Edificio e3 = gps.creaEdificio("edificio3", "via edificio3", "Foggia");
		Edificio e4 = gps.creaEdificio("edificio4", "via edificio4", "Pescara");
		Edificio e5 = gps.creaEdificio("edificio5", "via edificio5", "Milano");
		
		Postazione p1 = gps.creaPostazione("P001", "descrizione 1", TipoPostazione.OPENSPACE, 100,e1);
		Postazione p2 = gps.creaPostazione("P002", "descrizione 2", TipoPostazione.PRIVATO, 1,e4);
		Postazione p3 = gps.creaPostazione("P003", "descrizione 3", TipoPostazione.SALA_RIUNIONI, 300,e2);
		Postazione p4 = gps.creaPostazione("P004", "descrizione 4", TipoPostazione.OPENSPACE, 200,e5);
		Postazione p5 = gps.creaPostazione("P005", "descrizione 5", TipoPostazione.SALA_RIUNIONI, 500,e3);
		
		Utente u1 = gps.creaUtente("Bombetta", "Mirko De Luca", "mirko@gmail.com");
		Utente u2 = gps.creaUtente("MR", "Mario Rossi", "mario@gmail.com");
		Utente u3 = gps.creaUtente("GB", "Giovanna Bianchi", "gio@gmail.com");
		Utente u4 = gps.creaUtente("fra", "Francesca Verdi", "fra@gmail.com");
		Utente u5 = gps.creaUtente("an", "Antonella ", "antonella@gmail.com");
		
		
		
		
//		gps.salvaEdificio(e1);
//		gps.salvaEdificio(e2);
//		gps.salvaEdificio(e3);
//		gps.salvaEdificio(e4);
//		gps.salvaEdificio(e5);
//		
//		gps.salvaPostazione(p1);
//		gps.salvaPostazione(p2);
//		gps.salvaPostazione(p3);
//		gps.salvaPostazione(p4);
//		gps.salvaPostazione(p5);
//				
//		gps.salvaUtente(u1);
//		gps.salvaUtente(u2);
//		gps.salvaUtente(u3);
//		gps.salvaUtente(u4);
//		gps.salvaUtente(u5);
		
		
		gps.prenotaPostazione(p1, u5, LocalDate.of(2023, 05, 12));
		gps.prenotaPostazione(p3, u4, LocalDate.of(2023, 05, 13));
		gps.prenotaPostazione(p2, u2, LocalDate.of(2023, 05, 14));
		
		
		
		
		
		
		
		
		
		
	}

}
