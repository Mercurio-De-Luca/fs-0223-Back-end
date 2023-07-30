package com.epicode.gestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.epicode.gestionePrenotazioni.enumerated.TipoPostazione;
import com.epicode.gestionePrenotazioni.model.Postazione;

public interface PostazioneDAORepository extends CrudRepository<Postazione, Long>{

	List<Postazione> findByTipoAndEdificioCitta(TipoPostazione tipo, String citta);
}
