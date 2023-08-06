package com.epicode.gestioneDispositivi.repositoryDispositivo;

import org.springframework.data.repository.CrudRepository;

import com.epicode.gestioneDispositivi.model.Utente;

public interface UtenteRepository extends CrudRepository<Utente, Long> {

	Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
