package com.compito.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Prestito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Utente utente;
	@ManyToOne
	private ElementoBibliotecario elementoPrestato;
	private LocalDate dataInizioPrestito;
	private LocalDate dataRestituzionePrevista;
	private LocalDate dataRestituzioneEffettiva;
	
	public Prestito() {
		super();
		// TODO Auto-generated constructor stub
	}

    

	public Prestito(Utente utente, ElementoBibliotecario elementoPrestato, LocalDate dataInizioPrestito,
			LocalDate dataRestituzionePrevista, LocalDate dataRestituzioneEffettiva) {
		super();
		this.utente = utente;
		this.elementoPrestato = elementoPrestato;
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista = dataRestituzionePrevista.plusDays(30);
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public ElementoBibliotecario getElementoPrestato() {
		return elementoPrestato;
	}

	public void setElementoPrestato(ElementoBibliotecario elementoPrestato) {
		elementoPrestato = elementoPrestato;
	}

	public LocalDate getDataInizioPrestito() {
		return dataInizioPrestito;
	}

	public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
	}

	public LocalDate getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}

	public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}

	public LocalDate getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}

	public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	@Override
	public String toString() {
		return "Prestito [id=" + id + ", utente=" + utente + ", ElementoPrestato=" + elementoPrestato
				+ ", dataInizioPrestito=" + dataInizioPrestito + ", dataRestituzionePrevista="
				+ dataRestituzionePrevista + ", dataRestituzioneEffettiva=" + dataRestituzioneEffettiva + "]";
	}
	
	
	

}
