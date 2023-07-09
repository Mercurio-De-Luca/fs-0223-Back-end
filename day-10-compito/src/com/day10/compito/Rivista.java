package com.day10.compito;

public class Rivista extends Biblioteca {
	
	private Periodicita periodicita;

	public Rivista(String isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
		super(isbn, titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	@Override
	public String toString() {
		return "Rivista [Isbn= " + Isbn + ", titolo= " + titolo + ", annoPubblicazione= " + annoPubblicazione +  ", numeroPagine= " + numeroPagine + ", periodicità= " + periodicita + "]";
	}
	
	

}
