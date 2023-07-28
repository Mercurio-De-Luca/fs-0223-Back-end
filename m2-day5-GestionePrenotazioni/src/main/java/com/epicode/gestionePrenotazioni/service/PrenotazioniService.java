package com.epicode.gestionePrenotazioni.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.gestionePrenotazioni.enums.TipoPostazione;
import com.epicode.gestionePrenotazioni.model.Edificio;
import com.epicode.gestionePrenotazioni.model.Postazione;
import com.epicode.gestionePrenotazioni.repository.PrenotazioniDAORepository;


@Service
public class PrenotazioniService {

	@Autowired PrenotazioniDAORepository repo;
	
	@Autowired @Qualifier("postazione") private ObjectProvider<Postazione> customPostazioneProvider;
	@Autowired @Qualifier("edificio") private ObjectProvider<Edificio> customEdificioProvider;
	 
	
	public Postazione createPostazione(String codice, String descrizione, TipoPostazione tipo, int numeroMassimoOccupanti,  Edificio edificio) {
		return customPostazioneProvider.getObject().builder().codice(codice).descrizione(descrizione).tipo(tipo).numeroMassimoOccupanti(numeroMassimoOccupanti).edificio(edificio).build();
	}
	
	public void createUser(Postazione p) {
		repo.save(p);
		System.out.println(" salvato nel DB!!!");
	}
	
}
