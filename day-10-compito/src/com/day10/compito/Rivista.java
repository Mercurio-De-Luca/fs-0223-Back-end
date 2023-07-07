package com.day10.compito;

import java.time.LocalDate;

public class Rivista extends Biblioteca {
	
	private Periodicita periodicita;

	public Rivista(String iSBN, String titolo, LocalDate annoPubblicazione, int numeroPagine, Periodicita periodicita) {
		super(iSBN, titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}
	
	public String getIsbn() {
		return ISBN;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Rivista [Codice ISBN=" + ISBN + ", Titolo= " + titolo + ", Anno publicazione= "+ AnnoPubblicazione + ", Numero pagine= "+ numeroPagine + "periodicita=" + periodicita + "]";
	}
	
	

}
