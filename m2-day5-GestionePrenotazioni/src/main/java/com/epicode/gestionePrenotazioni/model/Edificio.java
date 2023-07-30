package com.epicode.gestionePrenotazioni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Edificio {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String indirizzo;
    private String citta;
    
	public Edificio(String nome, String indirizzo, String citta) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
	}
    
    
}
