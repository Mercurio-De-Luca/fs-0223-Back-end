package com.epicode.gestionePrenotazioni.repository;

import org.springframework.data.repository.CrudRepository;

import com.epicode.gestionePrenotazioni.model.Utente;


public interface UtenteDAORepository extends CrudRepository<Utente, String>{

}
