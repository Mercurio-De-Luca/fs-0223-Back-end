package com.compito.model;

public class Rivsta extends ElementoBibliotecario {
	
	private Periodicita Periodicita;

	public Rivsta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rivsta(String isbn, String titolo, int annoPubblicazione, int numeroPagine) {
		super(isbn, titolo, annoPubblicazione, numeroPagine);
		// TODO Auto-generated constructor stub
	}

	public Rivsta(com.compito.model.Periodicita periodicita) {
		super();
		Periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return Periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		Periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Rivsta [Periodicita=" + Periodicita + "]";
	}
	
	

}
