package com.epicode.gestionePrenotazioni.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Prenotazione {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;
    @ManyToOne
    @JoinColumn(name = "utente_username")
    private Utente utente;  
    private LocalDate data;
    
	public Prenotazione(Postazione postazione, Utente utente, LocalDate data) {
		super();
		this.postazione = postazione;
		this.utente = utente;
		this.data = data;
	}

    
}
