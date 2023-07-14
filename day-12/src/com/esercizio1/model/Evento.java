package com.esercizio1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventi") 
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	@Column( nullable = false)
	private String titolo;
	private String descrizione;
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo di evento", nullable = false)
	private TipoEvento tipoevento;
	@Column(name = "numero massimo di partecipanti", nullable = false)
	private Integer numeroMassimoPartecipanti;
	
	public Evento() {
		super();
	}

	public Evento(String titolo, String descrizione, TipoEvento tipoevento, Integer numeroMassimoPartecipanti) {
		super();
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.tipoevento = tipoevento;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public TipoEvento getTipoevento() {
		return tipoevento;
	}

	public void setTipoevento(TipoEvento tipoevento) {
		this.tipoevento = tipoevento;
	}

	public Integer getNumeroMassimoPartecipanti() {
		return numeroMassimoPartecipanti;
	}

	public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", descrizione=" + descrizione + ", tipoevento=" + tipoevento
				+ ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti + "]";
	}

	
	
}
