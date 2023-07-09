package com.day10.compito;

public abstract class Biblioteca {

	String Isbn;
	String titolo;
	int annoPubblicazione;
	int numeroPagine;
	
	public Biblioteca(String isbn, String titolo, int annoPubblicazione, int numeroPagine) {
		super();
		Isbn = isbn;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
	}

	public String getIsbn() {
		return Isbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}
}
