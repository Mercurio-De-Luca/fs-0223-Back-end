package com.day10.compito;

import java.time.LocalDate;

public abstract class Biblioteca {

	String ISBN;
	String titolo;
	LocalDate AnnoPubblicazione;
	int numeroPagine;
	
	
	public Biblioteca(String iSBN, String titolo, LocalDate annoPubblicazione, int numeroPagine) {
		super();
		ISBN = iSBN;
		this.titolo = titolo;
		AnnoPubblicazione = annoPubblicazione;
		numeroPagine = numeroPagine;
	}


	public LocalDate getAnnoPubblicazione() {
		return AnnoPubblicazione;
	}


	public void setAnnoPubblicazione(LocalDate annoPubblicazione) {
		AnnoPubblicazione = annoPubblicazione;
	}

}
