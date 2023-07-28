package com.epicode.gestionePrenotazioni.repository;

import org.springframework.data.repository.CrudRepository;

import com.epicode.gestionePrenotazioni.model.Postazione;

public interface PrenotazioniDAORepository extends CrudRepository<Postazione, Long> {

}