package com.epicode.gestionePrenotazioni.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.gestionePrenotazioni.enumerated.TipoPostazione;
import com.epicode.gestionePrenotazioni.model.Edificio;
import com.epicode.gestionePrenotazioni.model.Postazione;
import com.epicode.gestionePrenotazioni.model.Prenotazione;
import com.epicode.gestionePrenotazioni.model.Utente;
import com.epicode.gestionePrenotazioni.repository.EdificioDAORepository;
import com.epicode.gestionePrenotazioni.repository.PostazioneDAORepository;
import com.epicode.gestionePrenotazioni.repository.PrenotazioneDAORepository;
import com.epicode.gestionePrenotazioni.repository.UtenteDAORepository;

@Service
public class GestionePrenotazioniService {

	@Autowired PostazioneDAORepository repoPostazione;
	@Autowired EdificioDAORepository repoEdificio;
	@Autowired UtenteDAORepository repoUtente;
	@Autowired PrenotazioneDAORepository repoPrenotazione;
	
	@Autowired @Qualifier("customPostazioneBean") private ObjectProvider<Postazione> customPostazioneProvider;
	@Autowired @Qualifier("customEdificioBean") private ObjectProvider<Edificio> customEdificioProvider;
	@Autowired @Qualifier("customUtenteBean") private ObjectProvider<Utente> customUtenteProvider;
	@Autowired @Qualifier("customPrenotazioneBean") private ObjectProvider<Prenotazione> customPrenotazioneProvider;

	public Postazione creaPostazione(String codice, String descrizione, TipoPostazione tipo, int numeroMassimoOccupanti, Edificio edificio) {
		return customPostazioneProvider.getObject().builder().codice(codice).descrizione(descrizione).tipo(tipo).numeroMassimoOccupanti(numeroMassimoOccupanti).edificio(edificio).build();
	}
	
	public Edificio creaEdificio(String nome, String indirizzo, String citta) {
		return customEdificioProvider.getObject().builder().nome(nome).indirizzo(indirizzo).citta(citta).build();
	}
	
	public Utente creaUtente(String username, String nomeCompleto, String email) {
		return customUtenteProvider.getObject().builder().username(username).nomeCompleto(nomeCompleto).email(email).build();
	}
	
	public void salvaPostazione(Postazione p) {
			repoPostazione.save(p);
			System.out.println("Postazione salvata!!");
	}
	
	public void salvaEdificio(Edificio e) {
			repoEdificio.save(e);
			System.out.println("Edificio salvato!!");
	}
	
	public void salvaUtente(Utente u) {
			repoUtente.save(u);
			System.out.println("Utente salvato!!");
	}
	
}
