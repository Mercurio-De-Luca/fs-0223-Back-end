package com.epicode.gestionePrenotazioni.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity 
@Table(name = "prenotazioni")
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate date;
	@ManyToOne
    @JoinColumn(name = "utente_username")
	private Utente utente;
	@ManyToOne
    @JoinColumn(name = "postazione_id")
	private Postazione postazione;
	
	public Prenotazione(LocalDate date, Utente utente, Postazione postazione) {
		super();
		this.date = date;
		this.utente = utente;
		this.postazione = postazione;
	}

}
