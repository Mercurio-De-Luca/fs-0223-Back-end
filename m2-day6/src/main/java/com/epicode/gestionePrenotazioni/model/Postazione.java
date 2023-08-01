package com.epicode.gestionePrenotazioni.model;

import com.epicode.gestionePrenotazioni.enumerated.TipoPostazione;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class Postazione {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String codice;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;
    private int numeroMassimoOccupanti;
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

	public Postazione(String codice, String descrizione, TipoPostazione tipo, int numeroMassimoOccupanti,
			Edificio edificio) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.numeroMassimoOccupanti = numeroMassimoOccupanti;
		this.edificio = edificio;
	}
    
    

}
