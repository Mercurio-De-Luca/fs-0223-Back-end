package com.epicode.gestionePrenotazioni.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.epicode.gestionePrenotazioni.model.Postazione;
import com.epicode.gestionePrenotazioni.model.Prenotazione;

public interface PrenotazioneDAORepository extends CrudRepository<Prenotazione, Long>{

	List<Prenotazione> findByPostazioneAndData(Postazione postazione, LocalDate data);
}
